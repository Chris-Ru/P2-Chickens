package com.example.sping_portfolio.Minilab.Minilab4.Shekar;

//imports
import java.util.ArrayList;
import lombok.Getter;
import java.time.Duration;
import java.time.Instant;
@Getter
public abstract class backend {
    Duration timeElapsed;
    int num1;

    public ArrayList<Integer> factor(int num1){
        //creates factor storing array
        ArrayList<Integer> factors = new ArrayList<Integer>(2);

        //checks for factors
        for(int i = 1; i<=num1; i++)
            if(num1 % i == 0){
                factors.add(i);
            }
        return factors;
    }

    //requires findsum method for all gcf classes
    public abstract int findsum();

    //requires getmethod method for all gcf classes
    public abstract String getMethod();

    //return runtime
    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }
}


