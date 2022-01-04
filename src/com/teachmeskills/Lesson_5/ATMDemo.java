package com.teachmeskills.Lesson_5;

public class ATMDemo {

    public static void main (String[] args){
        ATM atm = new ATM(9,10,12);

        System.out.println("_______________");
        atm.getATMInfo();

        System.out.println("_______________");
        atm.withdrawCash(155);

        System.out.println("_______________");
        atm.getATMInfo();

        System.out.println("_______________");
        atm.withdrawCash(260);

//        System.out.println("_______________");
//        atm.getATMInfo();
    }
}
