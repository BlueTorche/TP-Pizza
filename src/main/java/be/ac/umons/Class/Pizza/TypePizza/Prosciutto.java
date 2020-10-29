package be.ac.umons.Class.Pizza.TypePizza;

import be.ac.umons.Class.Ingredient.TypeIngredient.Cheese;
import be.ac.umons.Class.Ingredient.TypeIngredient.Dough;
import be.ac.umons.Class.Ingredient.TypeIngredient.Ham;
import be.ac.umons.Class.Ingredient.TypeIngredient.TomatoSauce;
import be.ac.umons.Class.Pizza.Pizza;

public class Prosciutto extends Pizza {
    public Prosciutto() {
            addIngredient(new Dough());
            addIngredient(new TomatoSauce());
            addIngredient(new Ham());
            addIngredient(new Cheese());
    };


}
