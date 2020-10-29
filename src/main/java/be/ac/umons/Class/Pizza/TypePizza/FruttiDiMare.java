package be.ac.umons.Class.Pizza.TypePizza;

import be.ac.umons.Class.Ingredient.TypeIngredient.*;
import be.ac.umons.Class.Pizza.Pizza;

public class FruttiDiMare extends Pizza {
    public FruttiDiMare(){
        addIngredient(new Dough());
        addIngredient(new TomatoSauce());
        addIngredient(new SeaFood());
        addIngredient(new Cheese());
    };
}
