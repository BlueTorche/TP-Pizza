package be.ac.umons.Class.Pizza.TypePizza;

import be.ac.umons.Class.Ingredient.TypeIngredient.*;
import be.ac.umons.Class.Pizza.Pizza;

public class FruttiDiMare extends Pizza {
    public FruttiDiMare(){
        this.addIngredient(new Dough());
        this.addIngredient(new TomatoSauce());
        this.addIngredient(new SeaFood());
        this.addIngredient(new Cheese());
    };
}
