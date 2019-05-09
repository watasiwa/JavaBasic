package test;

import java.util.Arrays;

public class Practice3 {

	public static void main(String[] args) {

		int[] numbers = new int[15];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		// shuffle(numbers);
		// System.out.println(Arrays.toString(numbers));
		select(numbers);
		System.out.println(Arrays.toString(numbers));

	}

	private static void select(int[] numbers) {

		for (int i = 0; i < numbers.length; i++) {
			int j = (int) (Math.random() * 15);
			int temp = numbers[j];
			numbers[j] = numbers[i];
			numbers[i] = temp;
		}

		System.out.println(Arrays.toString(numbers));
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {

					int tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
	}

}
// private static void shuffle(int[] numbers) {
//
//
// for (int i = 1; i < numbers.length - 1; i++) {
// int random2 = (int) (Math.random() * numbers.length);
// numbers[i] = i;
// int temp = numbers[0];
// numbers[0] = random;
// random = numbers[0];
// }

