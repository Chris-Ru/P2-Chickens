package com.example.sping_portfolio.functions;

public class average {
    //data
    private int values[];

    //constructor
    //public average(int values) {
        //this.values = values;
    //}

    //method
    public void average(){
        double valsum = 0;
        for (int i = 0; i < this.values.length; i++){
            valsum += i;
        }
        double valavg = valsum/this.values.length;
    }
}

