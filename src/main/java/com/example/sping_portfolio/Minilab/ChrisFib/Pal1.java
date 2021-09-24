package com.example.sping_portfolio.Minilab.ChrisFib;

/*
 * Palindrome Check
 * -----------------
 * A String is a palindrome, if it is unchanged even when it is reversed.
 *
 * example words are :
 * radar, civic, level, racecar
 */


public class Pal1 {
    public static void main(String[] args) {
//      String word = "civic";
//		String word = "radar";
//		String word = "level";
		String word = "elephant";
//		String word = "java";

        System.out.println("The Given String \"" + word + "\"");
        if (checkPalindrome(word))
            System.out.println("Yes, it is a Palindrome");
        else
            System.out.println("No, it is NOT a Palindrome");
    }

    public static boolean checkPalindrome(String str) {
        int strLen = str.length();

        //The logic is compare 1st char with last char (nth char)
        //Then compare 2nd char with (n-1) char
        //here index starts with 0, so compare index 0 with index (n-1)
        //then compare index 1 with index (n-2)
        //do this comparison for half of the string,
        //if is palindrome 2nd half the string is mirror(reverse) of the 1st half
        for (int i = 0; i < str.length() / 2; i++)
            if (str.charAt(i) != str.charAt(strLen - i - 1))
                return false;
        return true;
    }
}
/*
	OUTPUT

	The Given String "malayalam"
	Yes, it is a Palindrome

	The Given String "radar"
	Yes, it is a Palindrome
	The Given String "civic"
	Yes, it is a Palindrome

	The Given String "elephant"
	No, it is NOT a Palindrome
	The Given String "java"
	No, it is NOT a Palindrome
*/

