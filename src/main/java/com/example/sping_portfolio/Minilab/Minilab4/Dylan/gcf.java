//location
package com.example.sping_portfolio.Minilab.Minilab4.Dylan;

//imports
import java.util.ArrayList;

public class gcf {
    //variables
    private int num1;
    private int num2;

    //constructor
    public gcf(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    //factoring function
    public ArrayList<Integer> factor(int num){
        //creates factor storing array
        ArrayList<Integer> factors = new ArrayList<Integer>(2);

        //checks for factors
        for(int i = 1; i<=num; i++)
            if(num % i == 0){
                factors.add(i);
            }
        return factors;
    }

    public static void main(String[] args){
        gcf test = new gcf(1, 2);
        System.out.print(test.factor(20));
    }
}
