package labs.reflection;

import java.lang.instrument.*;
import labs.reflection.Taco;

public class MyAgent {
  public static void premain(String args, Instrumentation inst) {
    Taco obj = new Taco("al pastor");
    long size = inst.getObjectSize(obj);
    System.out.println("Bytes used by object: " + size);
  }
}