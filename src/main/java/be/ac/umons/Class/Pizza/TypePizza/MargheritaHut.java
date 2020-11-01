package be.ac.umons.Class.Pizza.TypePizza;

import be.ac.umons.Class.Ingredient.TypeIngredient.Olive;

public class MargheritaHut extends Margherita{
    public MargheritaHut(){
        super();
        this.addIngredient(new Olive());
    }
}
