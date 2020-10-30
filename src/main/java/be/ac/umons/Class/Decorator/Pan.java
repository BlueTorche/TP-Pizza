package be.ac.umons.Class.Decorator;

import be.ac.umons.Class.Pizza.Pizza;

public class Pan extends DecoratorPizza{
    private double suplément = 1.5; // à l'avenir on pourrait utiliser une DB
    public Pan(){}

    public Pizza DecoratePizza(Pizza p){
        p.setPrice(p.getPrice() + suplément);
        p.setName("Pan " + p.getName());
        return p;
    }

    @Override
    public String getName() { return p.getName(); }
    @Override
    public void setName(String name) { p.setName(name);  }

    @Override
    public double getPrice() { return p.getPrice(); }
    @Override
    public void setPrice(double price) { p.setPrice(price); }
}
