package ru.fedichkindenis.newyear.toy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Toy {

    protected String name;
    protected Integer size;
    protected BigDecimal cost;

    public Toy(String name, Integer size, BigDecimal cost) {
        this.name = name;
        this.size = size;
        this.cost = cost;
    }

    public String getDescription() {

        return "Toy: " + name + " size: " +
                size + " cost: " + cost + "$";
    }

    public BigDecimal getCost() {

        return cost;
    }
}
