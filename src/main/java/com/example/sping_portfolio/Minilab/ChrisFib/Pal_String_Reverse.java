package com.example.sping_portfolio.Minilab.ChrisFib;

public class Pal_String_Reverse extends _Pal {
    public Pal_String_Reverse(String word) {
        super(word);
    }

    @Override
    protected void init() {
        super.name = "String Reverse Loop";
        // creates empty builder, capacity 16
        StringBuilder sb = new StringBuilder(word);
        // reverse it
        sb.reverse();
        // return string representation of the word
        String rev = sb.toString();

        // if the word is a palindrome then return true, otherwise don't
        if (word.equals(rev)) {
            super.setData("True");
        }
        else {
            super.setData("False");
        }
    }
}
