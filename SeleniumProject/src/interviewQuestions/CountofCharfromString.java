package interviewQuestions;

public class CountofCharfromString {

	public static void main(String[] args) {
		
		String someString = "elephant";
		char someChar = 'e';
		int count = 0;
		 
		for (int i = 0; i < someString.length(); i++) {
		    if (someString.charAt(i) == someChar) {
		        count++;
		    }
		}
	}

}
