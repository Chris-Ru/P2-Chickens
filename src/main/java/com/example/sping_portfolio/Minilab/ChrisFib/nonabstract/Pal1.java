package com.example.sping_portfolio.Minilab.ChrisFib.nonabstract;

/*
 * Palindrome Check
 * -----------------
 * A String is a palindrome, if it is unchanged even when it is reversed.
 *
 * example words are :
 * radar, civic, level, racecar
*/

public class Pal1 {
    // initialize instance variable
    private static String word;

    // Constructor
    public Pal1(String word)
    {
        this.word = word;
    }

    // Getter
    public static String getWord(){return word;}

    // Method
    public static boolean checkPalindrome(String word) {
        int strLen = word.length();
        //The logic is compare 1st char with last char (nth char)
        //Then compare 2nd char with (n-1) char
        //here index starts with 0, so compare index 0 with index (n-1)
        //then compare index 1 with index (n-2)
        //do this comparison for half of the string,
        //if is palindrome 2nd half the string is mirror(reverse) of the 1st half
        for (int i = 0; i < word.length() / 2; i++)
            if (word.charAt(i) != word.charAt(strLen - i - 1))
                return false;
        return true;
    }

    //runs program
    public static void main(String[] args) {
        //System.out.println("The Given String \"" + word + "\"");
        //if (checkPalindrome(word))
        //System.out.println("Yes, it is a Palindrome");
        //else
        //System.out.println("No, it is NOT a Palindrome");


        Pal1 myPal = new Pal1("civic");
        System.out.println("The Given String \"" + word + "\"");
        myPal.checkPalindrome(getWord());
        myPal.getWord();
        System.out.print(checkPalindrome(word));
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