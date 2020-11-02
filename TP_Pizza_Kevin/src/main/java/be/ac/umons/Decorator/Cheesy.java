package be.ac.umons.Decorator;

import be.ac.umons.Pizza.Pizza;

import java.math.BigDecimal;

public class Cheesy extends DecoratorPizza{
    public double supplément = 2.0;

    public Cheesy(Pizza p){
        this.p = new Pizza(p.getName(), p.getListIngredients());
        p.setName("Cheesy " + p.getName());
        p.setPrice(new BigDecimal(supplément + p.getPrice().doubleValue()));
    }
    public Pizza DecoratePizza(){
        return p;
    }
    public String getName(){ return p.getName(); }
    public BigDecimal getPrice(){
        return p.getPrice();
    }
    public void setName(String name){
        p.setName(name);
    }
    public void setPrice(BigDecimal price){
        p.setPrice(price);
    }
}
