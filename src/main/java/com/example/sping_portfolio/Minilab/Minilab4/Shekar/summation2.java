package com.example.sping_portfolio.Minilab.Minilab4.Shekar;

public class summation2 {
    private int summ;
    private int num1;

    //constructor
    public summation2(int num1) {
        this.num1 = num1;
        this.summ = num1;
    }

    public int value=72;
    public int number=5;
    public int sigma() {
        this.summ = (this.summ + (value*number)) / (number+1);
        return summ;
    }
}
