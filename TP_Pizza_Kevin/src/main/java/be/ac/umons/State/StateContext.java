package be.ac.umons.State;

public class StateContext {
    private State state;
    public StateContext() {
        this.state = new ConstructionState();
    }
    public void setState(State state){this.state = state;}

    public void utilisation() {state.utilisation(this);}
}
