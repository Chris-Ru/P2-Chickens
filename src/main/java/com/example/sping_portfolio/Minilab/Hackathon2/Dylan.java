package com.example.sping_portfolio.Minilab.Hackathon2;

class Car {

    //protected data
    private String make;
    private String model;
    private int oil;

    //constructor
    public Car(String make, String model, int oil)
    {
        this.make = make;
        this.model = model;
        this.oil = oil;
    }

    //get protected data
    public String getMake()
    {
        return make;
    }

    public String getModel()
    {

        return model;
    }

    public int getOil()
    {

        return oil;
    }

    //method
    public void oilchange()
    {
        if (this.oil >= 3000)
        {
            System.out.println("You Need an Oil Change");
        }
    }

    //call class
    public static void main(String[] args)
    {
        Car myCar = new Car("Porsche", "911", 4000);
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Oil: " + myCar.getOil());
        myCar.oilchange();

    }
}