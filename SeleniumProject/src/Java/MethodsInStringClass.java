package Java;

public class MethodsInStringClass {

	public static void main(String[] args) {
		// vsequalmethod==

		String s1 = "ghi";// only scp area

		String s2 = "ghi";// only scp area

		String ss3 = new String("ghi");// both scp+heap memory

		boolean ispointingtosameobject = s1 == ss3;

		System.out.println(ispointingtosameobject);

		boolean ispointingtosameobject2 = s1 == s2;
		System.out.println(ispointingtosameobject2);

		String s3 = "abc";
		String s4 = "aBc";

		// equals method

		boolean isequal = s3.equals(s4);
		System.out.println(isequal);

		// equalsignorecase

		boolean isequal2 = s3.equalsIgnoreCase(s4);
		System.out.println(isequal2);

		// length
		String s5 = "corporatetrainingcentre";
		int sizeofString = s5.length();
		System.out.println(sizeofString);

		// substring

		String substring = s5.substring(9);
		System.out.println(substring);

		String substring2 = s5.substring(9, 16);
		System.out.println(substring2);

	}

}
