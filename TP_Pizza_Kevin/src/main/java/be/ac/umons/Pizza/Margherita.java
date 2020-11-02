package be.ac.umons.Pizza;

import be.ac.umons.Ingredients.*;

public class Margherita extends Pizza{
    public Margherita() {
        super("Margherita");
        this.addIngredient(new Pâte());
        this.addIngredient(new SauceTomate());
        this.addIngredient(new Fromage());
    }
}
