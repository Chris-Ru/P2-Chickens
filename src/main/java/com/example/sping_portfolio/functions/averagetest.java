package com.example.sping_portfolio.functions;

public class averagetest {
    //protected data
    private int values[];

    //constructor
    public averagetest(int[] values){
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

    public static void main(String[] args){
        int[] array1 = new int[]{10, 20, 21, 40, 50, 61, 12};
        averagetest newaverage = new averagetest(array1);
        System.out.print(newaverage.avg());
    }
}