package be.ac.umons.Class.Decorator;

import be.ac.umons.Class.Pizza.Pizza;
import be.ac.umons.Class.PizzaComponent;

public abstract class DecoratorPizza implements PizzaComponent {
    protected Pizza p;

    public abstract Pizza DecoratePizza(Pizza p);


}
