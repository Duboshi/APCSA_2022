//with Chapter 12, Shape, Circle, EquiPoly, Square

public abstract class EquiPoly extends Shape{
	//variables
	private int num_side;
	private double sideLeng;
	
	//constructor
	public EquiPoly(String polyName, int n, double polySide) {
		super(polyName);
		num_side = n;
		sideLeng = polySide;
	}
	
	//methods
	public double getNum() {
		return num_side;
	}
	
	public double getSide() {
		return sideLeng;
	}
	
	public double perimeter() {
		return num_side*sideLeng;
	}

	//inherited abstract method area() is not shown
	//It is possible for an abstract class to have no abstract methods
	//Since the abstract subclasses of an abstract superclass inherits the abstract methods without explicitly declaring them.
}
