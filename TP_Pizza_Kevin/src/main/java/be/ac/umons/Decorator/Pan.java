package be.ac.umons.Decorator;

import be.ac.umons.Pizza.Pizza;

import java.math.BigDecimal;

public class Pan extends DecoratorPizza{
    private double supplément = 1.5;

    public Pan(){
        this.p = new Pizza(p.getName(), p.getListIngredients());
        p.setName("Pan " + p.getName());
        p.setPrice(new BigDecimal(supplément + p.getPrice().doubleValue()));
    }
    public Pizza DecoratePizza(){
        return new Pizza("");
    }
    public String getName(){
        return "";
    }
    public BigDecimal getPrice(){
        return new BigDecimal(0.0);
    }
    public void setName(String name){

    }
    public void setPrice(BigDecimal price){

    }
}
