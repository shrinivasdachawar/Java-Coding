package javaPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BiggestNumber {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(65);
		numbers.add(76);
		numbers.add(5);
		numbers.add(4);
		numbers.add(33);
		numbers.add(4);
		numbers.add(34);
		numbers.add(232);
		numbers.add(3);
		numbers.add(2323);
		int minNumber = Collections.min(numbers);
		System.out.println(minNumber);

	}

}
