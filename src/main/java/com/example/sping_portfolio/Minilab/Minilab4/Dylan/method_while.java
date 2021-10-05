package com.example.sping_portfolio.Minilab.Minilab4.Dylan;
import java.util.ArrayList;

public class method_while extends gcf{
    //variables
    private int x;
    private int num1;
    private int num2;

    //constructor
    public method_while(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //required findgcf method from parent
    @Override
    public int findgcf() {
        //creates a list of every factor for each of the values
        ArrayList<Integer> factor1 = factor(this.num1);
        ArrayList<Integer> factor2 = factor(this.num2);

        //stops loop when num1 = num2
        while(this.num1 != this.num2){
            //subtracts smaller number from larger number, loops until numbers are equal
            if (num1 > num2){
                num1 -= num2;
            }
            else{
                num2 -= num1;
            }
        }

        return num1;
    }

    @Override
    public String getMethod(){
        return "While";
    }
}
