package javaPractise;

public class CharCount {

	public static void main(String[] args) {
		String s = "AABBBCCCCA";
		int len = s.length();
		for (int i = 0; i < len; i++) {
			int count = 1;
			while (len - 1 > i && s.charAt(i) == s.charAt(i + 1)) {
				count++;
				i++;
			}
			System.out.print(s.charAt(i) + "" + count);
		}

	}

}
