package com.example.sping_portfolio.Minilab.ChrisFib;

// Java implementation of the approach
public class Pal2 {

    // Function that returns true if
    // str is a palindrome
    static boolean isPalindrome(String str)
    {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
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
        String str = "civic";

        if (isPalindrome(str))
            System.out.print("It is a Palindrome");
        else
            System.out.print("It is NOT a Palindrome");
    }
}
