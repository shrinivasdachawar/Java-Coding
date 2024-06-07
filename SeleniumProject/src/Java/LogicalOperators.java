package Java;

public class LogicalOperators {

	// Logical AND operator
	// logical OR operator
	// logical NOT Operator

	public static void main(String[] args) {

		int x = 80;
		int y = 10;

		boolean a = (x > 0) && (y > 0);
		System.out.println(a);

		boolean b = (x > y) && (y > 50);

		System.out.println(b);

		boolean c = (x > 50) || (y > 50);
		System.out.println(c);

		boolean d = (y > x) || (x > 100);
		System.out.println(d);

		boolean e = !(x == 80);
		System.out.println(e);

	}

}
