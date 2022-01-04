package com.teachmeskills.Lesson_5;

public class RAM {

    int priceRam;
    String modelRam;

    public RAM(int priceRam, String modelRam) {
        this.priceRam = priceRam;
        this.modelRam = modelRam;
    }

    public RAM (){

    }

    @Override
    public String toString() {
        return "RAM{" +
                "priceRam=" + priceRam +
                ", modelRam='" + modelRam + '\'' +
                '}';
    }
}