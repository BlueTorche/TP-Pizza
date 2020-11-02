package be.ac.umons.Class.State;

import be.ac.umons.Class.Pizza.Pizza;
import org.reflections.Reflections;

import java.util.*;

public class Running implements State{


    @Override
    public void menu(StateContext context) {
        System.out.println("Welcomme to Pizzatron 9000");
        System.out.println("Souhaitez vous passez (C)ommande, accéder aux (O)ptions ou (Q)uitter ?");

        Scanner s = new Scanner(System.in);
        String answ = s.nextLine();

        if(answ.equals("C")) context.carte(context);
        if(answ.equals("O")) this.option(context);
        else System.out.println("Bye");
    }

    @Override
    public void carte(StateContext context){
        ArrayList<Pizza> carte = new ArrayList<>();
        Reflections reflections = new Reflections("be.ac.umons.Class.Pizza");

        Set<Class<? extends Pizza>> classSet = reflections.getSubTypesOf(Pizza.class);
        for(Class<? extends Pizza> clazz : classSet) {
            try {
                Pizza pizza = clazz.newInstance();
                carte.add(pizza);
            } catch (IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
        ListIterator<Pizza> it = carte.listIterator();
        boolean run = true;

        while(run){
            System.out.println("Sélectioné:");
            it.toString();
            System.out.println("(C)ommander, (P)récédent, (S)uivant,(M)enu,(Q)uitter");

            Scanner s = new Scanner(System.in);
            String answ = s.nextLine();

            if(answ.equals("C")) context.commande(context,it.next());
            if(answ.equals("P")){
                if(!it.hasPrevious()) while(it.hasNext()) it.next();
                else it.previous();
            }
            if(answ.equals("S")){
                if(!it.hasNext()) while(it.hasPrevious()) it.previous();
                else it.next();
            }
            if(answ.equals("M")) context.menu(context);
        }
    }

    @Override
    public void commande(StateContext context,Pizza pizza) {

    }

    public void option(StateContext context){
        System.out.println("Options + (R)etour");

        Scanner s = new Scanner(System.in);
        String answ = s.nextLine();

        if(answ.equals("R")) context.menu(context);
    }
}
