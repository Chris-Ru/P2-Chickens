package com.example.sping_portfolio.Minilab.Minilab4.Shekar;

public class sigma {
    private int summ;
    private int num1;

    //constructor
    public sigma(int num1) {
        this.num1 = num1;
        this.summ = num1;
    }

    public int sigma() {
        this.summ = (this.summ + 50) / 3;
        return summ;
    }
}
