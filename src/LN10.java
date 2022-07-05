/*
 * Lecture note 10. Inheritance and Polymorphism
 * with Student, HighSchooler, UnderGrad
 */

public class LN10 {

	//Driver class
	public static void main(String[] args) {
		Student s = new Student("Steve",  new int[] {50, 60, 70}, "");
		//s: reference type(Left) = Student, actual object/instance type(Right) = Student
		System.out.println(s.getName());
		s.printClass();
		//System.out.println(s.getAverage());	//private method that cannot be invoked outside the defining class
		s.computeGrade();
		System.out.println(s.getGrade());
		System.out.println();
		
		HighSchooler h1 = new HighSchooler("Hicks", new int[] {50, 60, 70}, "", 1);
		//h1: reference type = HighSchooler, actual object/instance type = HighSchooler
		System.out.println(h1.getName());
		h1.printClass();
		//System.out.println(h1.getAverage());	//private method that cannot be invoked outside the defining class
		h1.computeGrade();
		System.out.println(h1.getGrade());
		System.out.println();
		
		Student h2 = new HighSchooler("Hill", new int[] {50, 60, 70}, "", 2);
		//h2: reference type = Student, actual object/instance type = HighSchooler
		//superclass name = new subclass(); is right
		//subclass name = new superclass(); is wrong
		System.out.println(h2.getName());
		h2.printClass();	//HighSchooler
		//System.out.println(h2.getAverage());	//private method that cannot be invoked outside the defining class
		h2.computeGrade();
		System.out.println(h2.getGrade());
		System.out.println();
		//Polymorphism: early/static binding (compile), late/dynamic binding (run)
		//late/dynamic binding: run-time, which method to invoke, determined by the actual object type
		
		//early/static binding: compile-time, whether the method can be invoked, reference type
		System.out.println(h1.getID());
		//downcasting: casting a superclass reference type to a subclass reference type
		System.out.println(((HighSchooler)h2).getID());	
		
		System.out.println(h1.compareTo(h2)); //Hicks, Hill, cdefghijkl, c + 9 = l
	}

}
