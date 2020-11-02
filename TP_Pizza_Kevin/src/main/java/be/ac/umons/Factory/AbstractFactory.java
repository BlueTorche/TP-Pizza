package be.ac.umons.Factory;

import be.ac.umons.Pizza.Pizza;

public abstract class AbstractFactory {
    String name;

    public AbstractFactory(String name) {this.name = name;}
    public abstract Pizza createPizza(String name);
}
