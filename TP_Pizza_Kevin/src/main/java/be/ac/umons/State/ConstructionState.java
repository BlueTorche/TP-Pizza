package be.ac.umons.State;

public class ConstructionState implements State{
    @Override
    public void utilisation(StateContext context){
        try {
            Thread.sleep(1000); //Simulation d'attente de temps de construction
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        context.setState(new NormalState());
    }

}
