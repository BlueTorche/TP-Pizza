package be.ac.umons.Class.Ingredient.TypeIngredient;

import be.ac.umons.Class.FireWall;
import be.ac.umons.Class.Ingredient.Ingredient;

public class Olive extends Ingredient {
    public Olive(){ super("Olive", FireWall.getPrice("Olive"));  }
}
