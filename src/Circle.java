//with Chapter 12, Shape, Circle, EquiPoly, Square

public class Circle extends Shape{
	//a concrete subclass of an abstract superclass must override all inherited abstract methods into concrete methods.
	
	//variables
	private double radius;
	
	//constructors
	public Circle(String circleName, double r) {
		super(circleName);
		radius = r;
	}
	
	//methods
	public double getR() {
		return radius;
	}

	@Override
	public double area() {
		return Math.PI*radius*radius;
	}

	@Override
	public double perimeter() {
		return 2*Math.PI*radius;
	}
}
