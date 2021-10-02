package com.example.sping_portfolio.Minilab.ChrisFib;

import com.example.sping_portfolio.controllers.ConsoleUI.ConsoleMethods;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;

import lombok.Getter;

/*
 _Fibonacci class contains generalized logic to capture and analyze a Fibonacci sequence.
 _Fibonacci is an "abstract" class, meaning it can't be initialized directly
 The "_" in name is used to push this "Parent" Class to top of package file listing.
 */
@Getter  // this will enable standard Getters on attributes in Class in form "getName" where "name" is attribute
public abstract class _Pal {
    String word;
    private String yesOrNo;
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

    /*
     Method is abstract as init() requires extender to define their own Fibonacci algorithm
     Method is protected as it is only authorized to someone who extends the class
     */
    protected abstract void init();

    /*
     Number is added to Fibonacci sequence, current state of "list" is added to hash for hashID "num"
     */
    public void setData(String results) {
        list.add(results);
        // hash.put(this.hashID++, list.clone());

    }

    /*
     Custom Getter for timeElapsed in init process, timeElapsed.getNano() is part of Duration class
     */
    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }

    /*
     Custom Getter to return last element in Fibonacci sequence
     */

//
//    public long getNth() {
//        return list.get(size - 1);
//    }

    public static void main(String[] args) {
        PalFor.main(null);
        PalRecurse.main(null);
        Pal_String_Reverse.main(null);
        PalWhile.main(null);
    }
}