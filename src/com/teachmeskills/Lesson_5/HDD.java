package com.teachmeskills.Lesson_5;

public class HDD {

    int priceHDD;
    String modelHDD;
    int externalType;

    public HDD(int priceHDD, String modelHDD, int externalType) {
        this.priceHDD = priceHDD;
        this.modelHDD = modelHDD;
        this.externalType = externalType;
    }

    public HDD() {

    }

    @Override
    public String toString() {
        return "HDD{" +
                "priceHDD=" + priceHDD +
                ", modelHDD='" + modelHDD + '\'' +
                ", externalType=" + externalType +
                '}';
    }
}