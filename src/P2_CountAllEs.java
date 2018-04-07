import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
ISYS 320 DONE DONE DONE!!
	Name(s):Dave Rapp
	Date: 4-8-18
*/

/* 2. Your pseudocode algorithm in here
 - take in inpu
 - find matches 
 - print instances of letter "e"
 */

public class P2_CountAllEs {

	public static void main(String[] args) {
		System.out.println("Hello my name is Dave");
		String example = "Hello my name is Dave";
		Matcher m = Pattern.compile("e").matcher(example);

		int matches = 0;
		while(m.find())
		    matches++;

		System.out.println("The number of E's in the string is " + matches);
	}
	}

