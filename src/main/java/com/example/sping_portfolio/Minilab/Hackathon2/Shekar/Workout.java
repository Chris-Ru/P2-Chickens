//Shekar
package com.example.sping_portfolio.Minilab.Hackathon2.Shekar;

public class Workout {
    //protected data
    private String muscle;
    private int reps;
    private int weight;

    //constructor
    public Workout(String muscle, int reps, int weight)
    {
        this.muscle = muscle;
        this.reps = reps;
        this.weight = weight;
    }

    //get protected data

    public String getMuscle()
    {
        return muscle;
    }

    public int getReps()
    {
        return reps;
    }

    public int getWeight()
    {
        return weight;
    }

    //method
    public void endurance()
    {
        if (this.reps >= 30)
        {
            System.out.println("This set is meant for endurance and hypertrophy");
        }
    }


    //call class
    public static void main(String[] args)
    {
        Workout myWorkout = new Workout("Chest", 12, 225);
        System.out.println("Muscle: " + myWorkout.getMuscle());
        System.out.println("Reps: " + myWorkout.getReps());
        System.out.println("Weight: " + myWorkout.getWeight());
        myWorkout.endurance();

    }
}
