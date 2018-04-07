
/*
ISYS 320
	Name(s): Dave Rapp
	Date: 4-7-18
*/

import java.util.Scanner;

public class P4_LongestInputString {

	public static void main(String[] args) {
		

		System.out.print("How many words will you enter? ");
		Scanner input = new Scanner(System.in);
		int numOfWords = input.nextInt();

		System.out.print("Enter words ");
		

		String word1 = "", word2 = "";
		int l1 = 0, l2 = 0;

		while (input.hasNext()) {
			word1 = input.next();

			l1 = word1.length();
			if (l1 > l2) {
				l2 = l1;
				word2 = word1;
				input.close();
				System.out.println("Longest Word: " + word2);
				System.out.println("Length of Word: " + l2);
			}

		}

	}
}
