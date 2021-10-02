package com.example.sping_portfolio.Minilab.ChrisFib;

public class PalRecurse extends _Pal {
    public PalRecurse() {super();}
    public PalRecurse(String word) {
        super(word);
    }

@Override
protected void init() {
    super.name = "Recursive Loop";
    word = word.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase().replaceAll("\\p{Z}", "");
    int getLength = word.length();
    int i = 0;
    while (i < (getLength - 1)) {
        String checkChar = String.valueOf(word.charAt(i));
        String lastChar = String.valueOf(word.charAt(getLength - i - 1));

        if (!checkChar.equals(lastChar)) super.setData("False");
        if (checkChar.equals(lastChar)) super.setData("True");

        i++;
    }
    }
}
