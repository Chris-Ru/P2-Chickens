package com.example.sping_portfolio.Minilab.ChrisFib;

import static com.example.sping_portfolio.Minilab.ChrisFib.Pal3.checkPalindrome;
import com.example.sping_portfolio.Minilab.ChrisFib._Pal;

public class PalRecurse extends _Pal {
    public PalRecurse() {super();}
    public PalRecurse(String word) {
        super(word);
    }

@Override
protected void init() {
    super.name = "Recursive Loop";
    if (word.length() == 0 || word.length() == 1)
        super.setData("True");
    if (word.charAt(0) == word.charAt(word.length() - 1)) {
        /* check for first and last char of String:
         * if they are same then do the same thing for a substring
         * with first and last char removed. and carry on this
         * until you string completes or condition fails
         * Function calling itself: Recursion
         */

        super.setData(checkPalindrome(word.substring(1, word.length() - 1)));
    }
    /* If program control reaches to this statement it means
     * the String is not palindrome hence return false.
     */
    super.setData("False");
    }
}
