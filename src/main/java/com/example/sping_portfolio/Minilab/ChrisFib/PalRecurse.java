package com.example.sping_portfolio.Minilab.ChrisFib;

public class PalRecurse extends _Pal {
    public PalRecurse(String word) {
        super(word);
    }

    @Override
    protected void init() {
        super.name = "Recursive Loop";
        int n = word.length();

        // checking for if word is one string, one string = Palindrome
        if (n == 0)
            super.setData("True");

        // checks to see if word is one character or the word is same forward and back from isPalRec
        super.setData(isPalRec(word, 0, n - 1)); ;
    }
    static void boolean isPalRec(String word, int s, int e)
    {
        // If there is only one character
        if (s == e)
            super.setData("True");

        // If first and last
        // characters do not match
        if ((word.charAt(s)) != (word.charAt(e)))
            super.setData("False");

        // If there are more than
        // two characters, check if
        // middle substring is also
        // palindrome or not.
        if (s < e + 1)
            return isPalRec(word, s + 1, e - 1);

        super.setData("True");
    }
}
