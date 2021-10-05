package com.example.sping_portfolio.Minilab.Minilab4.Dylan;

//imports
import java.util.ArrayList;
import lombok.Getter;
import java.time.Duration;
import java.time.Instant;

@Getter
abstract class gcf {

    //variables
    Duration timeElapsed;

    public gcf(){
        //start timer
        //Instant start = Instant.now();
        //run main function
        //this.findgcf();
        //end timer
        //Instant end = Instant.now();

        //get time
        //this.timeElapsed = Duration.between(start, end);
    }

    //creates list of factors
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

    //requires findgcf method for all gcf classes
    public abstract int findgcf();

    //requires getmethod method for all gcf classes
    public abstract String getMethod();

    //return runtime
    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }
}