package com.example.sping_portfolio.Minilab.Minilab4.Dylan;

public class method_recursive extends gcf {

    //variables
    private int check;
    private int num1;
    private int num2;

    //constructor
    public method_recursive(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.check = num1;
    }

    //required findgcf method from parent
    @Override
    //a recursive function runs itself until its base case is reached
    public int findgcf() {
        //base case
        if (this.num1 % check == 0 && this.num2 % check == 0) {
            return check;
        }

        //run function
        this.check --;
        return findgcf();
    }

    @Override
    public String getMethod(){
        return "Recursive";
    }

    public static void main (String[] args){
        method_recursive myrecursive = new method_recursive(12, 30);
        System.out.print(myrecursive.findgcf());
    }
}
