package be.ac.umons.Observer;

import be.ac.umons.Ingredients.Ingredient;

public abstract class Observer extends Ingredient {
    abstract public String notifyO(Ingredient i);
}
