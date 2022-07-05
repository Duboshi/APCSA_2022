//with Chapter 12, Shape, Circle, EquiPoly, Square

public abstract class Shape implements Comparable<Object> {
	//An abstract class is a class that contains at least one abstract method
	
	//variable
	private String name;
	
	//Constructors
	public Shape(String shapeName) {
		name = shapeName;
	}
	
	//Methods
	public String getName() {
		return name;
	}
	
	public abstract double area();
	public abstract double perimeter();
	
	//An abstract class can have concrete methods
	public double semiPerimeter() {
		return this.perimeter()/2;
	}
	
	public int compareTo(Object o) {
		final double EPSILON = 1.0e-15;
		double diff = this.area() - ((Shape)o).area();
		//downcasting: casting a superclass type to a subclass type
		
		if (Math.abs(diff) <= EPSILON)
			return 0;
		else
			if (diff<0)
				return -1;
			else
				return 1;
	}
}
