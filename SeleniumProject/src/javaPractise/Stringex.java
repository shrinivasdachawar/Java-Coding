package javaPractise;

public class Stringex {

	public static void main(String[] args) {
		
		
		//String s1 = "My Name is shrinivas";
		//String s2  = s1.toUpperCase();
		//System.out.println(s2);
		
		
		//Length of the string
		
		//int length = s1.length();		
		//System.out.println("length of the string is :" + length);
		
		
		//Concatenate the string
		
		//String s2 = "Automation Tester";
		
		//String s3 = s1.concat(s2);
		
		//System.out.println(" After Concatenation :" + s3);
		
		
		//Replace the string 
		
	/*	String s2 = "Selenium";
		
		String s3 = s1.replaceFirst("shrinivas", "Selenium");
		
		System.out.println("Original String is : " + s1);
		
		System.out.println("Replace String is : " + s3);
		*/
		
		String str = " Java Interview Questions ";
		str = str.replaceAll("\\s", "");
		System.out.println(str);
		
		
		
		
	}
}
