package be.ac.umons.Class.Ingredient.TypeIngredient;

import be.ac.umons.Class.FireWall;
import be.ac.umons.Class.Ingredient.Ingredient;

public class Dough extends Ingredient {
    public Dough(){ super("Dough", FireWall.getPrice("Dough"));  }
}
