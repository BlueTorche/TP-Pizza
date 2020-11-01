package be.ac.umons.Class.State;

import be.ac.umons.Class.Pizza.Pizza;
import java.lang.reflect.*;

import java.util.Scanner;

public class Running implements State{


    @Override
    public void menu(StateContext context) {
        System.out.println("Welcomme to Pizzatron 9000");
        System.out.println("Souhaitez vous passez (C)ommande, accéder aux (O)ptions ou (Q)uitter ?");

        Scanner s = new Scanner(System.in);
        String answ = s.nextLine();

        if(answ == "C") context.carte(context);
        if(answ == "O") this.option(context);
        else System.out.println("Bye");
    }

    @Override
    public void carte(StateContext context) {

    }

    @Override
    public void commande(StateContext context,Pizza pizza) {

    }

    public void option(StateContext context){
        System.out.println("Options + (R)etour");

        Scanner s = new Scanner(System.in);
        String answ = s.nextLine();

        if(answ == "R") context.menu(context);
    }
}
