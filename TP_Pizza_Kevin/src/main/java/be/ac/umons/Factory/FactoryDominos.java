package be.ac.umons.Factory;

import be.ac.umons.Pizza.*;

public final class FactoryDominos extends AbstractFactory{
    private static FactoryDominos factoryDominos;
    static int stock[];

    private FactoryDominos() {
        super("Domino's Pizza");
    }

    public static FactoryDominos getFactoryHut() {
        if(factoryDominos == null)
            factoryDominos = new FactoryDominos();
        return factoryDominos;
    }
    public Pizza createPizza(String name) {
        if(name == "Margherita"){
            return new Margherita();
        }
        else if(name == "Procsuitto") {
            return new Prosciutto();
        }
        else if(name == "Frutti di Mare") {
            return new FruttiDiMare();
        }
        else if(name == "Carbonara") {
            return new Carbonara();
        }
        else {
            System.out.print("error creation Pizza: Incorrect name doesn't exist: " + name);
            return new Pizza("");
        }
    }


}

