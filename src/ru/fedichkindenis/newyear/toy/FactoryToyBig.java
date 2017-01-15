package ru.fedichkindenis.newyear.toy;

import java.math.BigDecimal;

public class FactoryToyBig implements FactoryToy {

    @Override
    public Toy createToy(String type) {

        switch (type) {

            case "rabbit": return new BigRabbit("big rabbit", 1, new BigDecimal("1"));
            case "duck": return new BigDuck("big duck", 1, new BigDecimal("1"));
        }

        return null;
    }
}
