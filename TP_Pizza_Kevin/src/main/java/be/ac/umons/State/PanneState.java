package be.ac.umons.State;

public class PanneState implements State{
    @Override
    public void utilisation(StateContext context){
        try {
            System.out.println("Waiting for someone to repair the Pizza's Distributor");
            Thread.sleep(1000); //Simulation d'attente de réparation
            System.out.print(". ");
            Thread.sleep(1000); //Simulation d'attente de réparation
            System.out.print(". ");
            Thread.sleep(1000); //Simulation d'attente de réparation
            System.out.print(". ");
            Thread.sleep(1000); //Simulation d'attente de réparation
            System.out.println("Distributor fixed.");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        context.setState(new NormalState());
    }
}
