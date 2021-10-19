package com.example.sping_portfolio.Minilab.Minilab4.Shekar;

public class summation extends backend{
    //variables
    private int summ;
    private int num1;

    //constructor
    public summation(int num1) {
        this.num1 = num1;
        this.summ = num1;
    }

    @Override
    public int findsum() {
        while (this.num1 > 0) {
            this.summ = this.summ + this.num1;
            this.num1 = this.num1 - 1;
        }
        return summ;
    }


    @Override
    public String getMethod(){
        return "while";
    }



    }
