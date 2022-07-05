/*
 * Lecture Note 11 Abstract Class and Interface
 */

public class LN11 {

	private static final String List = null;

	public static void main(String[] args) {
		//Abstract class
		//Shape s1 = new Shape("Shape1");
		//Shape s2 = new EquiPoly("Shape2", 4, 10);
		//An abstract class can NOT be instantiated.
		
		//But an abstract class can be the reference type of an object/instance of its concrete subclass
		Shape s3 = new Circle("Shape3", 10);
		EquiPoly s4 = new Square("Shape4", 10);
		System.out.println(s3.area());
		System.out.println(s4.area());
		
		//Interface: a reference type that contains only abstract method and default method (not in AP Exam)
		System.out.println("Hicks".compareTo("Hill")); //cdefghijkl: c + 9 = l
		//Interface Comparable
		System.out.println(s3.compareTo(s4));
		
		//An interface does NOT provide implementation of any of its methods.
		//Abstract class may provide.
		
		//Subclasses of Shape class will implement Comparable interface and inherit compareTo method.
		
		//An non-abstract class that implements an interface must implement every abstract method of the interface.
		
		//An interface can NOT contain instance variables.
		//An abstract class can.
		
		//Interfaces can be used as reference types.
		Comparable s5 = new Square("Shape5", 10);
		System.out.println(s4.compareTo(s5));
		
	}
}
