package be.ac.umons.Class.State;

import be.ac.umons.Class.Pizza.Pizza;
import org.reflections.Reflections;

import java.util.*;

public class Running implements State{


    @Override
    public void menu(StateContext context) {
        CommonTask.showMenu(context);
    }

    @Override
    public void carte(StateContext context){
        LinkedList<Pizza> carte = new LinkedList<>();
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
            System.out.println(it.next().toString());
            it.previous();
            System.out.println("(C)ommander, (P)récédent, (S)uivant,(M)enu,(Q)uitter");

            Scanner s = new Scanner(System.in);
            String answ = s.nextLine();

            switch (answ) {
                case "C" :
                    context.commande(context,it.next());
                    break;

                case "P":
                    if (!it.hasPrevious()){
                        while (it.hasNext()) it.next() ;
                        it.previous();
                    }
                    else it.previous();
                    break;

                case "S":
                    it.next();
                    if (!it.hasNext()){
                        while (it.hasPrevious()) it.previous();
                    }
                    break;

                case "Q":
                    run = false;
                    break;
            }
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
