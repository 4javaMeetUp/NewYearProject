package ru.fedichkindenis.newyear;

import ru.fedichkindenis.newyear.toy.*;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        FactoryToy factoryToy1 = new FactoryToyBig();
        FactoryToy factoryToy2 = new FactoryToySmall();

        Toy toy = factoryToy2.createToy("rabbit");

        System.out.println(toy.getDescription());
    }
}
