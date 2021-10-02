package com.example.sping_portfolio.Minilab.ChrisFib.nonabstract;

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

    // Method for regular class
    public static boolean checkPalindrome(String word) {
        // we take the word and strip the whitespace and puntcuation between the words
        // then we lowercase it all and strip the whitespace around the sentences
        word = word.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase().replaceAll("\\p{Z}","");
        int getLength = word.length();
        int i = 0;

        // if the the string is empty or one letter/number
        // then it is obviously a palindrome
        if (getLength == 0 || getLength == 1) return true;

        // we are adding "backwards" to the while loop stop counter
        // every loop, we add -1 to the length of total
        // which essentially gets both indexes of going forward (i)
        // and going backward (int getLength-i)
        // and from there, if we don't hit true then it's obviously false

        while (i < (getLength-i)) {
            String checkChar = String.valueOf(word.charAt(i));
            String lastChar = String.valueOf(word.charAt(getLength-i-1));

            // where the java-magic happens
            if (!checkChar.equals(lastChar)) return false;

            i++;
        }
        return true;
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
