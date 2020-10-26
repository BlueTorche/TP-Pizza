package be.ac.umons.Class.Ingredient.TypeIngredient;

import be.ac.umons.Class.FireWall;
import be.ac.umons.Class.Ingredient.Ingredient;

public class Mushroom extends Ingredient {
    public Mushroom (){ super("Mushroom", FireWall.getPrice("Mushroom"));  }
}
