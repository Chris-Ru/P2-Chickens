package com.example.sping_portfolio.Minilab.ChrisFib;

public class PalWhile extends _Pal {
    public PalWhile(String word) {
        super(word);
    }

    @Override
    protected void init() {
        super.name = "While Loop";
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = word.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (word.charAt(i) != word.charAt(j))
                super.setData("False");

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        super.setData("True");
    }
}
