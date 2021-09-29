package com.example.sping_portfolio.Minilab.ChrisFib;

import java.io.*;

class Pal3
{
    // A recursive function that
    // check a str(s..e) is
    // palindrome or not.

    // Initialize instance variable
    private static String str;

    // Constructor
    public Pal3(String str)
    {
        this.str = str;
    }

    // Getter
    public static String getStr(){return str;}

    // Method 1
    static boolean isPalRec(String str, int s, int e)
    {
        // If there is only one character
        if (s == e)
            return true;

        // If first and last
        // characters do not match
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;

        // If there are more than
        // two characters, check if
        // middle substring is also
        // palindrome or not.
        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);

        return true;
    }

    // Method 2
    static boolean isPalindrome(String str)
    {
        int n = str.length();

        // checking for if word is one string, one string = Palindrome
        if (n == 0)
            return true;

        // checks to see if word is one character or the word is same forward and back from isPalRec
        return isPalRec(str, 0, n - 1);
    }

    // Driver Code
    public static void main(String[] args)
    {
        Pal3 myPal = new Pal3("civic");
        System.out.println("The Given String \"" + str + "\"");
        myPal.isPalindrome(str);
        myPal.getStr();
        System.out.print(isPalindrome(str));

        //if (isPalindrome(str))
        //    System.out.println(str+ " is a palindrome");
        //else
        //    System.out.println(str + " is not a palindrome");
    }

}
