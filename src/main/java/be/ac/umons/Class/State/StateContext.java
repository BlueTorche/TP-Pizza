package be.ac.umons.Class.State;

import be.ac.umons.Class.Pizza.Pizza;

public class StateContext{
    private State state;

    public StateContext(){
        state = new Running();
    }

    public void setState(State newState) {
        this.state = newState;
    }

    public void menu(StateContext context){ state.menu(context); };
    public void carte(StateContext context){ state.carte(context);};
    public void commande(StateContext context,Pizza pizza){ state.commande(context,pizza);};
}
