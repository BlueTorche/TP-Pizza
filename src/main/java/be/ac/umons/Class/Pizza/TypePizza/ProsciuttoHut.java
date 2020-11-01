package be.ac.umons.Class.Pizza.TypePizza;

import be.ac.umons.Class.Ingredient.TypeIngredient.Olive;

public class ProsciuttoHut extends Prosciutto{
    public ProsciuttoHut(){
        super();
        this.addIngredient(new Olive());
    }
}
