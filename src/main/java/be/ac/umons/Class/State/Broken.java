package be.ac.umons.Class.State;

import be.ac.umons.Class.Pizza.Pizza;

import java.util.Scanner;

public class Broken implements State{
    @Override
    public void menu(StateContext context) {
        System.out.println("Machine cassée");
        System.out.println("Appeller un réparateur ?");

        Scanner s = new Scanner(System.in);
        String answ = s.nextLine();

        if(answ == "oui") {
            context.setState(new Running());
            context.menu(context);
        }
        else System.out.println("Tant pis");
    }

    @Override
    public void carte(StateContext context) {
        System.out.println("Illegal access");
    }

    @Override
    public void commande(StateContext context,Pizza pizza) {
        System.out.println("Illegal access");
    }
}
