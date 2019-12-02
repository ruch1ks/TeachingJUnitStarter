package a1;

public class Square extends Shape {

	private int side;
	public Square(String name, int side) {
		super(name);
		this.side = side;
	}
	
	public int getSide() {
		return side;
	}
	
	public double perimeter() {
		return side*side;
	}
	
	public double area() {
		return side*4;
	}
}

