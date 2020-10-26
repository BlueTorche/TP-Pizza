package be.ac.umons.Class.Ingredient.TypeIngredient;

import be.ac.umons.Class.FireWall;
import be.ac.umons.Class.Ingredient.Ingredient;

public class SeaFood extends Ingredient {
    public SeaFood(){ super("SeaFood", FireWall.getPrice("SeaFood"));  }
}
