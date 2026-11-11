package com.example;

import java.util.List;

public class Lion {

    // Зависимость передается через интерфейс/класс, а не создается внутри
    private final Predator predator;
    boolean hasMane;

    // Конструктор принимает Predator извне (Инъекция зависимостей)
    public Lion(Predator predator, String sex) throws Exception {
        this.predator = predator;

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
        return predator.eatMeat();
    }
}
