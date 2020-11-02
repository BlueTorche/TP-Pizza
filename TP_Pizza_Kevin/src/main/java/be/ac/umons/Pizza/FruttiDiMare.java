package be.ac.umons.Pizza;

import be.ac.umons.Ingredients.*;

public class FruttiDiMare extends Pizza{
    public FruttiDiMare() {
        super("Frutti Di Mare");
        this.addIngredient(new Pâte());
        this.addIngredient(new SauceTomate());
        this.addIngredient(new Fromage());
        this.addIngredient(new FruitsDeMer());
    }
}
