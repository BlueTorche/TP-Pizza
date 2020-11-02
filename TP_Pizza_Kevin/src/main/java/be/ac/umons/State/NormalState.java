package be.ac.umons.State;

public class NormalState implements State{
    @Override
    public void utilisation(StateContext context) {
        //State is normal, nothing to do

        double isDistributorOK = Math.random() % 100; //Simulateur de Panne aléatoire
        if(isDistributorOK < 1.0) {
            context.setState(new PanneState());
        }
    }
}
