package DayOne;

import java.util.ArrayList;
import java.util.Arrays;

/*
This problem was recently asked by Google.
Given a list of numbers and a number k, return whether any two numbers 
from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
*/

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 15, 3, 7));
		int k = 17;
		System.out.println(checkfork(list, k));
	}

	private static boolean checkfork(ArrayList<Integer> list, int value) {

		int k = value;
		int temp = -1;

		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = list.size() - 1; j > 0; j--) {
				temp = list.get(i) + list.get(j);
				if (temp == k) {
					return true;
				}
			}

		}

		return false;
	}
}
