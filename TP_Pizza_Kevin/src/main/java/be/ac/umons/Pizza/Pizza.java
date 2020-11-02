package be.ac.umons.Pizza;

import be.ac.umons.Ingredients.Ingredient;
import be.ac.umons.PizzaComponent;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Pizza extends Ingredient implements PizzaComponent {
    private ArrayList<Ingredient> listIngredients = new ArrayList<Ingredient>();

    public Pizza(String name){
        super(name);
        for(Ingredient i:listIngredients){
            this.setPrice(new BigDecimal(this.getPrice().doubleValue() + i.getPrice().doubleValue()));
        }
    }
    public Pizza(String name, ArrayList<Ingredient> listIngredients){
        super(name);
        this.listIngredients = listIngredients;
        for(Ingredient i:listIngredients){
            this.setPrice(new BigDecimal(this.getPrice().doubleValue() + i.getPrice().doubleValue()));
        }
    }

    public ArrayList<Ingredient> getListIngredients() { return this.listIngredients; }

    public void addIngredient(Ingredient i) {
        this.listIngredients.add(i);
    }
}
