package com.example.sping_portfolio.Minilab.Hackathon2;

class Computer {

    //protected data
    private String Case;
    private String cpu_type;
    private int ram;

    //constructor
    public Computer(String Case, String cpu_type, int ram)
    {
        this.Case = Case;
        this.cpu_type = cpu_type;
        this.ram = ram;
    }

    //get protected data
    public String getCase()
    {
        return Case;
    }

    public String getCpu()
    {
        return cpu_type;
    }

    public int getRam()
    {
        return ram;
    }

    //method
    public void incram()
    {
        if (this.ram <= 16)
        {
            System.out.println("You Need to Download More Ram");
        }
    }

    //call class
    public static void main(String[] args)
    {
        Computer myComputer = new Computer("NZXT","Ryzen", 8);
        System.out.println("Case: " + myComputer.getCase());
        System.out.println("Cpu-type: " + myComputer.getCpu());
        System.out.println("Ram amount: " + myComputer.getRam());
        myComputer.incram();

    }
}