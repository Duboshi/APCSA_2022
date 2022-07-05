//with LN10, Student, UnderGrad

public class HighSchooler extends Student{
	//extends means HigherSchooler is the subclass, Student is the superclass
	
	//A subclass can add new private instance variables
	private int ID;
	
	//Constructor are not inherited.
	//Private variables and methods are not inherited. So the subclass canNOT access them directly
	//But the subclass contains memory for private variables, they are be accessed by inherited accessors, and
	//mutated by inherited mutators.
	public HighSchooler() {
		super();
		//super(); means identical default constructor as the superclass.
		ID = 0;
	}
	
	public HighSchooler(String s, int[] arr, String g, int n) {
		super(s, arr, g);
		ID = n;
	}
	//If no constructor is written, the superclass default constructor will be generated automatically.
	//Additional instance variables of the subclass will be initialized as 0 for primitive types and 
	//null for reference types.
	//In this case, if superclass has no default constructor, a compile time error will error.
	
	public int getID() {
		return ID;
	}
	
	//method overriding������д����������Method overloading ��ͬһ���ࣩ
	//1. Private methods can NOT be overridden. But we can introduce a new one in the subclass.
	//2. Stuyatic methods can NOT be overridden. Even we declare a static method in the subclass with the same signature
	//as the one in the superclass, there won't be run-time polymorphism.
	//3. Public methods can NOT be overridden as private
	
	private double getAverage() {
		double total = 0;
		//Enhanced for loop
		for (int score:getTests())
			total += score;
		return total/NUM_TESTS;
	}
	
	public void computeGrade() {
		if(! getName().equals("")) { //if the actual student exists
			if (getAverage()*(NUM_TESTS/NUM_TESTS) >= 70)
				setGrade("Pass");
			else
				setGrade("Fail");
		} else
			setGrade("Not Applicable");
	}
	//But the subclass contains memory for private variables, they are be accessed by inherited accessors, and
	//mutated by inherited mutators.

	public void printClass() {
		System.out.println("HighSchooler");
	}
}
