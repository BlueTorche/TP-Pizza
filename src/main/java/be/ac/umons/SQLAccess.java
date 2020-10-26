package be.ac.umons;
import be.ac.umons.Class.Exception.DataNotFoundException;

import java.io.InputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class SQLAccess {
    public static double getPrice (String ingredient) throws ClassNotFoundException, SQLException, DataNotFoundException {

        // code trouvé sur internet
        try (InputStream input = SQLAccess.class    // permet d'avoir le path du fichier database.properties
                .getClassLoader()
                .getResourceAsStream("database.properties")) {

            Properties prop = new Properties();  //On définit un lecteur de fichier .properties

            if (input == null) {    //On vérifie que le fichier soit bien accessible
                System.out.println("Sorry, unable to find database.properties");
                return -1;
            }
                // si c'est ok on continue
            prop.load(input);  //load database.properties

            String url = prop.getProperty("db.url");  //lecture
            String user = prop.getProperty("db.user");// le sens des opération importe peu
            String pass = prop.getProperty("db.pass");// puisque c'est une requête directe

            //code du cours
            Class C = Class.forName ("com.mysql.cj.jdbc.Driver");
            if(C==null) throw new ClassNotFoundException("Cant find class named \"com.mysql.cj.jdbc.Driver\"");

            else {
                Connection conn = DriverManager
                        .getConnection(url + "user=" + user + "&password=" + pass);
                if (conn == null) throw new SQLException("Connection failed");

                else {
                    String requete = " SELECT nom, prix FROM ingredient WHERE nom = '" + ingredient + "'";
                    Statement stmt = conn.createStatement();
                    ResultSet res;
                    res = stmt.executeQuery(requete);
                    double prix = -1.5;
                    prix = res.getFloat(2);
                    if(prix == -1) throw new DataNotFoundException("Can't find price for " + ingredient +
                            ". Verify your database that "+ingredient+" is correctlt spelled");
                    System.out.println(prix);

                    stmt.close(); // On libère le Statement//
                    res.close(); // On libère le ResultSet
                    conn.close(); // On libère la Connection0

                    return prix;
                }
            }

        } catch (IOException e) {//Je ne vois pas l'utilité. En fait, je ne vois même pas l'utilité des catch error xD
            e.printStackTrace();
            return -1;
        }
    }
}
