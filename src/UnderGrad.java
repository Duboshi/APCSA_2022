//With LN10, Student and HighSchooler

public class UnderGrad extends Student{
	//no additional variables
	
	//default constructor will be generated automatically
	
	//value constructor
	public UnderGrad(String s, int[] arr, String g) {
		super(s, arr, g);
	}
	
	private double getAverage() {
		double total = 0;
		//Enhanced for loop
		for (int score:getTests())
			total += score;
		return total/NUM_TESTS;
	}
	
	//method partial overriding with super.supermethod();
	public void computeGrade() {
		//Copy and paste the superclass method
		super.computeGrade();
		
		//Additional
		if (getAverage() >= 90)
			setGrade("UnderGrad: Pass with Distinction");
	}
	
	public void printClass() {
		System.out.println("UnderGrad");
	}
}
