package com.example.sping_portfolio.Minilab.ChrisFib.nonabstract;

public class Pal4 {

    // initialize instance variable
    private static String word;

    // Constructor
    public Pal4(String word)
    {
        this.word = word;
    }

    // Getter
    public static String getWord(){return word;}

    // Method
    public static boolean checkPalindrome(String word){
        // creates empty builder, capacity 16
        StringBuilder /* can name to anything -> */ sb=new /* <- */ StringBuilder(word);
        // reverse it
        sb.reverse();
        // return string representation of the word
        String rev=sb.toString();

        // if the word is a palindrome then return true, otherwise don't
        if(word.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main (String[] args)
    {
        Pal4 myPal = new Pal4("civic");
        System.out.println("The Given String \"" + word + "\"");
        myPal.checkPalindrome(getWord());
        myPal.getWord();
        System.out.print(checkPalindrome(word));
    }
            //throws java.lang.Exception
    //{
        //checkPalindrome("malayalam");
        //checkPalindrome("GeeksforGeeks");
    //}
}
