package com.example.sping_portfolio.Minilab.ChrisFib;

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
    private static String str;

    // Constructor
    public Pal2(String str)
    {
        this.str = str;
    }

    // Getter
    public static String getStr(){return str;}

    // Method
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
        Pal2 myPal = new Pal2("civic");
        System.out.println("The Given String \"" + str + "\"");
        myPal.isPalindrome(getStr());
        myPal.getStr();
        System.out.print(isPalindrome(str));

        //if (isPalindrome(str))
            //System.out.print("It is a Palindrome");
        //else
            //System.out.print("It is NOT a Palindrome");
    }
}
