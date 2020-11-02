package be.ac.umons.Observer;

import be.ac.umons.Ingredients.Ingredient;

public class Stock extends Observer{
    @Override
    public String notifyO(Ingredient i) {
        if(i.getStock() < 5){
            return("Stock low: " + i.getStock());
        }
        else if(i.getStock() <= 0){
            return("Stock empty!");
        }
        else
            return("Stock OK: " + i.getStock());
    }
}
