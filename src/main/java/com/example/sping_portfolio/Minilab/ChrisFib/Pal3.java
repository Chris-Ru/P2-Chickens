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

    // Method 1
    static boolean isPalRec(String word, int s, int e)
    {
        // If there is only one character
        if (s == e)
            return true;

        // If first and last
        // characters do not match
        if ((word.charAt(s)) != (word.charAt(e)))
            return false;

        // If there are more than
        // two characters, check if
        // middle substring is also
        // palindrome or not.
        if (s < e + 1)
            return isPalRec(word, s + 1, e - 1);

        return true;
    }

    // Method 2
    static boolean isPalindrome(String word)
    {
        int n = word.length();

        // checking for if word is one string, one string = Palindrome
        if (n == 0)
            return true;

        // checks to see if word is one character or the word is same forward and back from isPalRec
        return isPalRec(word, 0, n - 1);
    }

    // Driver Code
    public static void main(String[] args)
    {
        Pal3 myPal = new Pal3("civic");
        System.out.println("The Given String \"" + word + "\"");
        myPal.isPalindrome(word);
        myPal.getWord();
        System.out.print(isPalindrome(word));

        //if (isPalindrome(str))
        //    System.out.println(str+ " is a palindrome");
        //else
        //    System.out.println(str + " is not a palindrome");
    }

}
