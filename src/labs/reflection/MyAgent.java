package labs.reflection;

import java.lang.instrument.*;
import labs.reflection.Taco;

public class MyAgent {
  private static volatile Instrumentation globalInstr;	
  
  public static void premain(String args, Instrumentation inst) {
	globalInstr = inst;
	  
    Taco obj = new Taco("al pastor");
    long size = inst.getObjectSize(obj);
    System.out.println("Bytes used by object: " + size);
    
  }
  
  public static long getObjectSize(Object obj) {
	    if (globalInstr == null)
	      throw new IllegalStateException("Agent not initted");
	    return globalInstr.getObjectSize(obj);
	  }
}