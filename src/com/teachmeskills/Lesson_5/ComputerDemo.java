package com.teachmeskills.Lesson_5;

import javafx.scene.image.PixelFormat;

public class ComputerDemo {
    public static void main(String[] args) {

        System.out.println("Start");

        Computer myComputer1 = new Computer(1500, "ML151010",TypeEnum.LAPTOP);
        HDD myHDD = new HDD(400, "ML1510", 1000);
        RAM myRAM = new RAM(100, "LL250");
        Computer myComputer2 = new Computer(1500, "ML151010", myHDD, myRAM,TypeEnum.DESKTOP);
        Computer myComputer3 = new Computer();

//      System.out.println(myComputer2.HDD.modelHDD);
        System.out.println(myComputer1);
        System.out.println(myComputer2);

        System.out.println("End");
    }
}