package be.ac.umons.Class.State;

import java.util.Scanner;

public class CommonTask {

    public static void showMenu(StateContext context){
        boolean run = true;
        System.out.println("Welcomme to Pizzatron 9000");
        while(run) {
            System.out.println("Souhaitez vous passez (C)ommande, accéder aux (O)ptions ou (Q)uitter ?");

            Scanner s = new Scanner(System.in);
            String answ = s.nextLine();

            switch (answ){
                case "C" :
                    context.carte(context);
                    break;
                case "O" :
                    option(context);
                    break;
                case "Q" :
                    System.out.println("Bye");
                    run = false;
                default :
                    System.out.println("Mauvaise pioche\n");
            }
        }
    }

    public static void carte(StateContext context){

    }
}
