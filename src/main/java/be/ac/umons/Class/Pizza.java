package be.ac.umons.Class;

import java.util.ArrayList;

public class Pizza {
    private String name;
    private float price = 0;
    private ArrayList<Ingredient> listIngredients;

    public Pizza(){this.name="Default Pizza";}
    public Pizza(String name){
        this.name = name;
        for(Ingredient i:listIngredients){
            this.price += i.getPrice();
        }
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public ArrayList<Ingredient> getListIngredients(){ return this.listIngredients; }
    public void addIngredient(Ingredient ingredient){ this.listIngredients.add(ingredient); }

    public String toString(){
        String Final = this.name;
        Final += "\t";
        for(Ingredient i:listIngredients){ Final += i.getName(); }
        Final += "\t";
        Final += Float.toString(this.price);
        return Final;
    }
}
