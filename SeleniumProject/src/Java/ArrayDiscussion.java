package Java;

public class ArrayDiscussion {

	public static void main(String[] args) {

		int a[] = new int[10];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		a[6] = 7;
		a[7] = 8;
		a[8] = 9;
		a[9] = 10;

		int size = a.length;
		System.out.println(size);

		for (int i = 0; i < size; i++) {

			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}

		}
		for (int i = 0; i < size; i++) {

			if (a[i] % 2 != 0) {
				System.out.println(a[i]);

			}

		}

	}

}
