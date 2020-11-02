package be.ac.umons.Decorator;

import be.ac.umons.Pizza.Pizza;
import be.ac.umons.PizzaComponent;

public abstract class DecoratorPizza implements PizzaComponent {
    protected Pizza p;

    public abstract Pizza DecoratePizza();
}
