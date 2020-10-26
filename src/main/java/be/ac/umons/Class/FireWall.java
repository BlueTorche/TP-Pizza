package be.ac.umons.Class;

import be.ac.umons.Class.Exception.DataNotFoundException;
import be.ac.umons.SQLAccess;
import be.ac.umons.util.ColorPrint;

import java.sql.SQLException;

public class FireWall {
    public static double getPrice(String ingredient){
        try{
            double price = SQLAccess.getPrice(ingredient);
            return price;
        } catch (ClassNotFoundException e){
            ColorPrint.printError(e.getMessage());
        }catch (SQLException e){
            ColorPrint.printError(e.getMessage());
        }catch (DataNotFoundException e){
            ColorPrint.printError(e.getMessage());
        }
        System.out.println("FireWall has blocked this action");
        return -1;
    }
}
