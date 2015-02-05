package labs.reflection;

public class Taco {

	private String name;
	
	public Taco(String name) {
		this.name = name;
	}

	public String getName() {
		System.out.println("hey");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
