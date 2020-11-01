package be.ac.umons.Class.Decorator;

import be.ac.umons.Class.Pizza.Pizza;

public class Cheesy extends DecoratorPizza{
    private double suplément = 2; // à l'avenir on pourrait utiliser une DB


    public Cheesy(){}

    public Pizza DecoratePizza(Pizza p){
        p.setPrice(p.getPrice() + suplément);
        p.setName("Cheesy " + p.getName());
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
