package be.ac.umons.Class.Pizza.TypePizza;

import be.ac.umons.Class.Ingredient.TypeIngredient.*;
import be.ac.umons.Class.Pizza.Pizza;

public class Carbonara extends Pizza {
    public Carbonara(){
        this.addIngredient(new Dough());
        this.addIngredient(new WhiteCream());
        this.addIngredient(new Ham());
        this.addIngredient(new Cheese());
    }
}
