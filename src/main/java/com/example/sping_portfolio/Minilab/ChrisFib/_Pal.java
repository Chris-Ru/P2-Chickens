package com.example.sping_portfolio.Minilab.ChrisFib;

import com.example.sping_portfolio.controllers.ConsoleUI.ConsoleMethods;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

import lombok.Getter;

@Getter  // this will enable standard Getters on attributes in Class in form "getName" where "name" is attribute
public abstract class _Pal {
    String word;
    private String TOrF;
    String name;
    Duration timeElapsed;
    ArrayList<String> list;

    public _Pal(String word) {
        this.word = word;
        this.list = new ArrayList<>();
        //initialize  time algorithm
        Instant start = Instant.now();  // time capture -- start
        this.init();
        Instant end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);

    }

    public _Pal() {
        this("level");
    }


    protected abstract void init();


    public void setData(String results) {
        list.add(results);
        TOrF = results;
    }

    /*
     Custom Getter for timeElapsed in init process, timeElapsed.getNano() is part of Duration class
     */
    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }

    public void print() {
        ConsoleMethods.println("Init Time = " + this.getTimeElapsed());
    }

    public static void main(String[] args) {
        PalFor.main(null);
        PalRecurse.main(null);
        PalWhile.main(null);
        Pal_String_Reverse.main(null);
    }
}