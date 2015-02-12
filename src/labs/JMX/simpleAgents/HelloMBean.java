package labs.JMX.simpleAgents;

public interface HelloMBean {

	   public void setMessage(String message);

	   public String getMessage();

	   public void sayHello();
	}