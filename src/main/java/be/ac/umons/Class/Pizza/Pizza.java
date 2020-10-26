package be.ac.umons.Class.Pizza;

import be.ac.umons.Class.Ingredient.Ingredient;

import java.util.ArrayList;

public class Pizza {
    private String name;
    private double price = 0;
    private ArrayList<Ingredient> listIngredients;

    public Pizza(){this.name="Default Pizza";}
    public Pizza(String name){
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<Ingredient> getListIngredients(){ return this.listIngredients; }
    public void addIngredient(Ingredient ingredient){
        this.listIngredients.add(ingredient);
        this.price += ingredient.getPrice();
    }

    public String toString(){
        String Final = this.name;
        Final += "\t";
        for(Ingredient i:listIngredients){ Final += i.getName() + " "; }
        Final += "\t";
        Final += Double.toString(this.price);
        return Final;
    }
}
