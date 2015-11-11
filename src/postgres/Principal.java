/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package postgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mria do carmo
 */
public class Principal {
    
    public Connection con = null; 
    
    public PreparedStatement stm;
    
    public Connection conectar() throws SQLException{
      return con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java","postgres","nirvana");
    }
    
    public void desconectar() throws SQLException{
         con.close();
    }
}
