package be.ac.umons.Class.State;

import be.ac.umons.Class.Pizza.Pizza;

public class Cooking implements State{
    @Override
    public void menu(StateContext context) {
        System.out.println("Illegal access");
    }

    @Override
    public void carte(StateContext context) {
        System.out.println("Illegal access");
    }

    @Override
    public void commande(StateContext context,Pizza pizza) {
        System.out.println("Another order is ordered");
    }
}
