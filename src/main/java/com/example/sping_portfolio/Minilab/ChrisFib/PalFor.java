package com.example.sping_portfolio.Minilab.ChrisFib;

import java.time.Instant;

public class PalFor extends _Pal {
    public PalFor(String word) {
        super(word);
    }

    @Override
    protected void init() {
        super.name = "For Loop";
        int strLen = word.length();
        //The logic is compare 1st char with last char (nth char)
        //Then compare 2nd char with (n-1) char
        //here index starts with 0, so compare index 0 with index (n-1)
        //then compare index 1 with index (n-2)
        //do this comparison for half of the string,
        //if is palindrome 2nd half the string is mirror(reverse) of the 1st half
        for (int i = 0; i < word.length() / 2; i++)
            if (word.charAt(i) != word.charAt(strLen - i - 1))
                super.setData("False");
            else super.setData("True");
    }
}
