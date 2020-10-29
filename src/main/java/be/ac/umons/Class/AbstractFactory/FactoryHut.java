package be.ac.umons.Class.AbstractFactory;

import be.ac.umons.Class.Pizza.Pizza;
import be.ac.umons.Class.Pizza.TypePizza.FruttiDiMare;
import be.ac.umons.Class.Pizza.TypePizza.Prosciutto;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class FactoryHut extends AbstractFactory {
    static String FactoryHut;
    static int stock[];

    @Override
    String getFactory() { return FactoryHut; }

    @Override
    Pizza createPizza(String name) {
        name= "com.mypackage.bean." + name + "Hut";

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
}
