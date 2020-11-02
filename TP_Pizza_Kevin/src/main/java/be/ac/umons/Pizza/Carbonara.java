package be.ac.umons.Pizza;

import be.ac.umons.Ingredients.*;

import javax.security.auth.login.CredentialException;

public class Carbonara extends Pizza{
    public Carbonara(){
        super("Carbonara");
        this.addIngredient(new Pâte());
        this.addIngredient(new Fromage());
        this.addIngredient(new Jambon());
        this.addIngredient(new CrèmeBlanche());
    }
}
