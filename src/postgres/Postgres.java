/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package postgres;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author mria do carmo
 */
public class Postgres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Principal p = new Principal();
        //p.conectar();
        String string = "lalalla"; 
        string.length();
        string.toUpperCase();
        string.split("");
        string.substring(3);
        String[] array = new String[10]; 
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }
}
