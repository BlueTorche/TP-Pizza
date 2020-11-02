package be.ac.umons.Pizza;

import be.ac.umons.Ingredients.Olive;

public class ProsciuttoHut extends Prosciutto{
    public ProsciuttoHut(){
        super();
        this.addIngredient(new Olive());
    }
}
