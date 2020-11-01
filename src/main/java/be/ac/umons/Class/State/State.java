package be.ac.umons.Class.State;

import be.ac.umons.Class.Pizza.Pizza;

public interface State {
    public void menu(StateContext context);
    public void carte(StateContext context);
    public void commande(StateContext context,Pizza pizza);

}
