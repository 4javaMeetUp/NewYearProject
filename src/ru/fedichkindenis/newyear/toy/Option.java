package ru.fedichkindenis.newyear.toy;

import ru.fedichkindenis.newyear.toy.Toy;

import java.math.BigDecimal;

public abstract class Option extends Toy {

    private Toy toy;

    public Option(String name, Integer size, BigDecimal cost, Toy toy) {
        super(name, size, cost);
        this.toy = toy;
    }

    @Override
    public String getDescription() {

        return toy.getDescription() + " Options: " + name + " size: " +
                size + " cost: " + cost + "$";
    }

    @Override
    public BigDecimal getCost() {

        return toy.getCost().add(cost);
    }
}
