package labs.reflection;
import java.lang.reflect.Method;


public class Main {
	
	public static void main(String[] args) {
		
		Taco tacoPastor = new Taco("Al pastor");
		System.out.println("Quiero un taco " + tacoPastor.getName());
		
		// How to get the class, if the instance is available
		System.out.println(tacoPastor.getClass());
		
		for (int i = 0; i < Double.class.getMethods().length; i++) {
			System.out.println(Double.class.getMethods()[i]);
		}
		
		// Invoke a method using the Method object
		Method method;
		try {
			method = tacoPastor.getClass().getMethod("getName", (Class<?> []) null);
			method.invoke(tacoPastor, (Object[]) null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
