package com.example.sping_portfolio.Minilab.Minilab4.Dylan;

public class method_for extends gcf{

    //variables
    private int x;
    private int num1;
    private int num2;
    private int gcf;

    //constructor
    public method_for(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.gcf = gcf;
    }

    //required findgcf method from parent
    @Override
    public int findgcf() {
        //loops for length of smaller number
        for(int i = 1; i <= this.num1 && i <= this.num2; i++){
            //checks number, if number is a common divisor or both it is stored as gcf
            //larger common divisors replace the previous
            //greatest common divisor is the last ocmmon divisor to be entered as gcf
            if(num1 % i == 0 && num2 % i ==0){
                this.gcf = i;
            }
        }

        //important to return gcf after loop finishes so every value can be checked
        //prevents premature ending of the loop
        return gcf;
    }

    @Override
    public String getMethod(){
        return "For";
    }
}