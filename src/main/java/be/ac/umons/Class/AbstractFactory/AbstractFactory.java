package be.ac.umons.Class.AbstractFactory;

import be.ac.umons.Class.Pizza.Pizza;

abstract class AbstractFactory {
    private String name;

    abstract String getFactory();
    abstract Pizza createPizza(String name);
}
