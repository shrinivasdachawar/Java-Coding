package Java;

public class Array2 {

	public static void main(String[] args) {
		String b[] = new String[4];

		b[0] = "atul";
		b[1] = "rahul";
		b[2] = "shrinivas";
		b[3] = "akshay";

		System.out.println(b[2]);

		int sizeofarray = b.length;
		System.out.println(sizeofarray);

		for (int i = 0; i < sizeofarray; i++) {
			System.out.println(b[i]);

		}

	}

}
