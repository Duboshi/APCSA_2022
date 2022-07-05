//With LN10, HighSchooler, UnderGrad

public class Student implements Comparable<Student>{
	//variables
	private String name;
	private int[] tests;
	private String grade;
	public final static int NUM_TESTS = 3;
	
	//default constructor
	public Student() {
		name = "";
		tests = new int [NUM_TESTS];
		grade = "";
	}
	
	//value constructor
	public Student(String s, int[] arr, String g) {
		name = s;
		tests = arr;
		grade = g;
	}
	
	//instance method: accessor/getter
	public String getName() {
		return name;
	}
	
	//instance method: accessor/getter
	public int[] getTests() {
		return tests;
	}
	
	//private method in the superclass, to be invoked in the superclass
	private double getAverage() {
		double total = 0;
		//Enhanced for loop
		for (int score:tests)
			total += score;
		return total/NUM_TESTS;
	}
	
	public String getGrade() {
		return grade;
	}
	
	//instance method: mutator/setter
	public void setGrade(String newGrade) {
		grade = newGrade;
	}
	
	public void computeGrade() {
		if(!name.equals("")) { //if the actual student exists
			if (this.getAverage() >= 60)
				grade = "Pass";
			else
				grade = "Fail";
		} else
			grade = "Not Applicable";
	}
	
	public void printClass() {
		System.out.println("Student");
	}
	
	public int compareTo(Student s) {
		return this.name.compareTo(s.getName());
	}
}
