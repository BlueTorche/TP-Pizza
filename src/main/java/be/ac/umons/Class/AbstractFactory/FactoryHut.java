package be.ac.umons.Class.AbstractFactory;

import be.ac.umons.Class.Pizza.Pizza;
import be.ac.umons.Class.Pizza.TypePizza.FruttiDiMare;
import be.ac.umons.Class.Pizza.TypePizza.Prosciutto;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class FactoryHut extends AbstractFactory {
    private static String FactoryHut;
    private static int stock[];
    private static FactoryHut instance = null;

    @Override
    String getFactory() { return FactoryHut; }

    @Override
    Pizza createPizza(String name) {
        name= "be.ac.umons.Class.Pizza.TypePizza." + name + "Hut";

        try {
            Class<?> nameClass = Class.forName(name);
            try{
                Constructor<?> Constructor = nameClass.getConstructor();
                try {
                    Pizza piz = (Pizza) Constructor.newInstance();
                    return piz;
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException e){
                    e.printStackTrace();
                }
            } catch (NoSuchMethodException e){ e.printStackTrace();}

        } catch (ClassNotFoundException e){ e.printStackTrace(); }

        return new Pizza();
    }

    public static FactoryHut getSingleton() {
        if (instance == null) {
            instance = new FactoryHut();
        }
        return instance;
    }
}
