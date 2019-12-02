package a1;

public abstract class Shape {

	private String name;
	public Shape(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract double perimeter();
	public abstract double area();
	
}
