package com.example.sping_portfolio.Minilab.ChrisFib.nonabstract;

/*
 * Palindrome Check
 * -----------------
 * A String is a palindrome, if it is unchanged even when it is reversed.
 *
 * example words are :
 * radar, civic, level, racecar
 */

public class Pal2 {
    // initialize instance variable
    private static String word;

    // Constructor
    public Pal2(String word)
    {
        this.word = word;
    }

    // Getter
    public static String getWord(){return word;}

    // Method
    public static boolean checkPalindrome(String word)
    {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = word.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (word.charAt(i) != word.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }

    // Driver code
    public static void main(String[] args)
    {
        Pal2 myPal = new Pal2("civic");
        System.out.println("The Given String \"" + word + "\"");
        myPal.checkPalindrome(getWord());
        myPal.getWord();
        System.out.print(checkPalindrome(word));

        //if (isPalindrome(str))
            //System.out.print("It is a Palindrome");
        //else
            //System.out.print("It is NOT a Palindrome");
    }
}
