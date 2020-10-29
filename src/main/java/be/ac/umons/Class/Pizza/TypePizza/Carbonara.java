package be.ac.umons.Class.Pizza.TypePizza;

import be.ac.umons.Class.Ingredient.TypeIngredient.*;
import be.ac.umons.Class.Pizza.Pizza;

public class Carbonara extends Pizza {
    public Carbonara(){
        addIngredient(new Dough());
        addIngredient(new WhiteCream());
        addIngredient(new Ham());
        addIngredient(new Cheese());
    }
}
