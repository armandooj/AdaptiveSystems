package labs.JMX.simpleAgents;

import javax.management.*;
import java.lang.management.*;
import com.sun.jdmk.comm.HtmlAdaptorServer;


public class SimpleHTMLAgent {
   private MBeanServer mbs = null;

   public SimpleHTMLAgent() {

      // Create an MBeanServer and HTML adaptor (J2SE 1.4)
      mbs = ManagementFactory.getPlatformMBeanServer();
      HtmlAdaptorServer adapter = new HtmlAdaptorServer();

      // Unique identification of MBeans
      Hello helloBean = new Hello();
      ObjectName adapterName = null;
      ObjectName helloName = null;

      try {
         // Uniquely identify the MBeans and register them with the MBeanServer 
         helloName = new ObjectName("SimpleAgent:name=hellothere");
         mbs.registerMBean(helloBean, helloName);
         // Register and start the HTML adaptor
         adapterName = new ObjectName("SimpleAgent:name=htmladapter,port=8000");
         adapter.setPort(8000);
         mbs.registerMBean(adapter, adapterName);
         adapter.start();
      } catch(Exception e) {
         e.printStackTrace();
      }
   }

   public static void main(String argv[]) {
      SimpleHTMLAgent agent = new SimpleHTMLAgent();
      System.out.println("SimpleAgent is running...");
   }
}