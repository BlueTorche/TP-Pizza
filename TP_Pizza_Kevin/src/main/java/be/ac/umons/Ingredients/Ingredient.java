package be.ac.umons.Ingredients;

import be.ac.umons.Observer.Observer;
import be.ac.umons.Observer.Stock;
import be.ac.umons.PizzaComponent;

import java.math.BigDecimal;
import java.util.stream.Collectors;

public class Ingredient implements PizzaComponent {
    private int stock;
    private Stock Collection;
    private String name;
    private BigDecimal price = new BigDecimal(0.0);

    public Ingredient() { }
    public Ingredient(String name, BigDecimal price){
        this.name = name;
        this.price = price;
    }
    public Ingredient(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public int getStock() {return stock;}

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void notifyObserver() {
        Collection.notifyO(this);
    }
}
