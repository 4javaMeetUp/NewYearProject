package ru.fedichkindenis.newyear.toy;


import java.math.BigDecimal;

public class FactoryToySmall implements FactoryToy {

    @Override
    public Toy createToy(String type) {

        switch (type) {

            case "rabbit": return new SmallRabbit("small rabbit", 1, new BigDecimal("1"));
            case "duck": return new SmallDuck("small duck", 1, new BigDecimal("1"));
        }

        return null;
    }
}
