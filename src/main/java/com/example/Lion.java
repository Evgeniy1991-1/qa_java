package com.example;

import java.util.List;

public class Lion extends Feline {

    private final Feline feline;
    boolean hasMane;

    public Lion(Feline feline, String sex) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            this.hasMane = true;
        } else if ("Самка".equals(sex)) {
            this.hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
