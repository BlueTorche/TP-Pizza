package be.ac.umons.Class.Ingredient.TypeIngredient;

import be.ac.umons.Class.FireWall;
import be.ac.umons.Class.Ingredient.Ingredient;
import be.ac.umons.SQLAccess;

public class Cheese extends Ingredient {
    public Cheese(){ super("Cheese", FireWall.getPrice("Cheese"));  }
}
