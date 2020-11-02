package be.ac.umons.Factory;

import be.ac.umons.Pizza.*;

public final class FactoryHut extends AbstractFactory{
    private static FactoryHut factoryHut;
    static int stock[];

    private FactoryHut() {
        super("Pizza Hut");
    }

    public static FactoryHut getFactoryHut() {
        if(factoryHut == null)
            factoryHut = new FactoryHut();
        return factoryHut;
    }

    public Pizza createPizza(String name) {
        if(name == "Margherita"){
            return new MargheritaHut();
        }
        else if(name == "Procsuitto") {
            return new ProsciuttoHut();
        }
        else if(name == "Frutti di Mare") {
            return new FruttiDiMareHut();
        }
        else if(name == "Carbonara") {
            return new CarbonaraHut();
        }
        else {
            System.out.print("error creation Pizza: Incorrect name doesn't exist: " + name);
            return new Pizza("");
        }
    }



}
