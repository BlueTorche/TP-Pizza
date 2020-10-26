package be.ac.umons.Class.Ingredient.TypeIngredient;

import be.ac.umons.Class.FireWall;
import be.ac.umons.Class.Ingredient.Ingredient;

public class Ham extends Ingredient {
    public Ham(){ super("Ham", FireWall.getPrice("Ham"));  }
}
