package com.example.sping_portfolio.Minilab.ChrisFib;

import java.io.*;

public class Pal3
{
    // A recursive function that
    // check a str(s..e) is
    // palindrome or not.

    // initialize instance variable
    private static String word;

    // Constructor
    public Pal3(String word)
    {
        this.word = word;
    }

    // Getter
    public static String getWord(){return word;}

    // Method
    public static String checkPalindrome(String word) {   // if length is 0 or 1 then String is palindrome
        if (word.length() == 0 || word.length() == 1)
            return "True";
        if (word.charAt(0) == word.charAt(word.length() - 1))
            /* check for first and last char of String:
             * if they are same then do the same thing for a substring
             * with first and last char removed. and carry on this
             * until you string completes or condition fails
             * Function calling itself: Recursion
             */
            return checkPalindrome(word.substring(1, word.length() - 1));

        /* If program control reaches to this statement it means
         * the String is not palindrome hence return false.
         */
        return "False";
    }

    // Driver Code
    public static void main(String[] args)
    {
        Pal3 myPal = new Pal3("civic");
        System.out.println("The Given String \"" + word + "\"");
        myPal.checkPalindrome(word);
        myPal.getWord();
        System.out.print(checkPalindrome(word));

        //if (isPalindrome(str))
        //    System.out.println(str+ " is a palindrome");
        //else
        //    System.out.println(str + " is not a palindrome");
    }

}
