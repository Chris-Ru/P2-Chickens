package com.example.sping_portfolio.functions;

public class average {
    //protected data
    private int values[];

    //constructor
    public average(int[] values){
        this.values = values;
    }

    //method
    public double avg(){
        //create sum variable
        double valsum = 0;
        //sum of array
        for (int x = 0; x<this.values.length; x++){
            valsum += this.values[x];
        }
        double valavg = valsum/this.values.length;
        return valavg;
    }
}