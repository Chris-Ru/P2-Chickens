package com.example.sping_portfolio.Minilab.Minilab3;

class De_Morgan {
    public static void main(String[] args) {
        boolean oversixfoot = false;
        boolean looksfit = true;

        if (oversixfoot && looksfit){
            System.out.println("You are like Allen (100% chance)");
        }
        else if (!(oversixfoot || !looksfit)){
            System.out.println("You are Charlie (0% chance)");
        }
        else if (oversixfoot || looksfit){
            System.out.println("You have a 50% chance");
        }
    }

}
