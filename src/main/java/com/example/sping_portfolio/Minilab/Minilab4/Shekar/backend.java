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


    public abstract int findsum();
    public abstract String getMethod();

    //return runtime
    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }
}


