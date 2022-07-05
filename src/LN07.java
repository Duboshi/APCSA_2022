/*
 * Lecture note 07: char and String
 */

public class LN07 {
	public static void main(String[] args) {
		
		//1. String concatenation
		System.out.println(1 + 2 + "AB");
		System.out.println("AB" + 1 + 2);
		System.out.println();
		
		//2. Characters, type char
		//Java provides 8 primitive data types for representing integers, real
		//number, characters and boolean values.
		//byte, short, int, long, float, double, char, boolean
		
		//An object is collection of data that provides a set of method.
		//String is an object.
		String fruit = "banana";
		String fruit2 = new String("Orange");
		char letter = fruit.charAt(0);
		System.out.println(letter);				//'b'
		System.out.println(letter == 'b');		//true
		System.out.println();
		
		//3. Unicode: each character is represented by a code unit.
		//The code units for upper case characters run from 65 to 90;
		//lower case characters run from 97 to 122.
		System.out.println("Roman alphabet: ");
		for (letter='A'; letter<='Z'; letter++)
			System.out.print(letter);
		System.out.println();
		
		for (int i=65; i<=90; ++i)
			System.out.print((char)i);
		System.out.println();
		
		//upper case Greek letters run from 913 to 937
		//lower case Greek letters run from 945 to 969.
		for (int i=913; i<=937; ++i)
			System.out.print((char)i);
		System.out.println();
		for (int i=945; i<=969; ++i)
			System.out.print((char)i);
		System.out.println();
		System.out.println();
		
		//4. String are immutable
		//Immutable: if once created, an object cannot be modified, the object
		//is immutable.
		//Strings are immutable by design.
		fruit = "orange";
		System.out.println(fruit);
		//The statement creates a new String, and fruit refers to the 
		//new String "orange".
		
		String name = "alan turing";
		String name2 = name.toUpperCase();
		System.out.println(name);	//alan turing
		System.out.println(name2);	//ALAN TURING
		//The toUpperCase method creates a new String. It does not change the
		//the string name referring to, "alan turing".
		
		name2 = name.replace("turing", "Neumann"); //alan Neumann
		System.out.println(name);	//alan turing
		System.out.println(name2);	//alan Neumann
		System.out.println();
		
		//5. String traversal
		//String provide the length() method that returns the number of characters
		//in the String.
		System.out.println(name2.length());			//12
		for (int i=0; i<name2.length(); ++i)  		
			System.out.print(name2.charAt(i));		//alan Neumann
		System.out.println();

		//Write a method reverse(String s) that returns a new String reversing the String s.
		name = "abcdefg";
		System.out.println(reverse(name)); 			//"gfedcba"
		System.out.println();
		
		//6. Substrings
		//name = "abcdefg"
		System.out.println(name.substring(1));		//"bcdefg"
		//The substring method returns a new string that copies characters from
		//an existing string, starting at the given index.
		System.out.println(name.substring(1, 2));	//"b"
		//first parameter included, second excluded
		System.out.println();
		
		//7. The indexOf method
		System.out.println(name.indexOf('a'));		//0
		//The indexOf method returns the index of the first appearance.
		System.out.println(name.indexOf("efg"));	//4
		//...returns the index of 1st appearance of substring "efg".
		System.out.println();
		
		//8. String comparison
		name = "abcde";
		String name1 = new String ("abcde");
		name2 = "abcde";
		System.out.println(name.equals(name1));		//true
		System.out.println(name == name1);			//false
		System.out.println(name == name2);			//true
		//The equals() method compares whether the two strings contain the same
		//characters. The == operator checks whether the two strings refer to 
		//the same object in the computer memory.
		
		name1 = "Turing, Alan";
		name2 = "Turing, Charles";
		System.out.println(name1.compareTo(name2));	//-2
		//The compareTo() method returns the difference between the two strings
		//If name1 comes first, the result will be negative.
		System.out.println();
		
		//9. Wrapper classes
		//Primitive data types do NOT provide methods, but for each primitive
		//type, there is a corresponding class in the Java library - Wrapper class.
		System.out.println(Integer.parseInt("12345")); 		//12345
		System.out.println(Boolean.parseBoolean("True"));	//true
		System.out.println(Boolean.parseBoolean("true"));	//true
		
		System.out.println(Integer.toString(12345));		//"12345"
		System.out.println(Boolean.toString(true));			//"true"
	}
	
	public static String reverse(String s) {
		String result = "";
		for (int i=s.length()-1; i>=0; --i)
			result = result + s.charAt(i);
		return result;
	}	
}