package be.ac.umons.Pizza;

import be.ac.umons.Ingredients.Olive;

public class MargheritaHut extends Margherita{
    public MargheritaHut() {
        super();
        this.addIngredient(new Olive());
    }
}
