package be.ac.umons.Pizza;

import be.ac.umons.Ingredients.*;
import be.ac.umons.Pizza.Pizza;

import java.math.BigDecimal;

public class Prosciutto extends Pizza {
    public Prosciutto(){
        super("Proscuitto");
        this.addIngredient(new Pâte());
        this.addIngredient(new SauceTomate());
        this.addIngredient(new Fromage());
        this.addIngredient(new Jambon());
    }
}
