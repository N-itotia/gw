/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Group9d;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author Nigel Itotia
 */

public class Db {
    
    Connection conn = null;
    
    public static Connection java_db(){
        try{
            
          Class.forName("org.sqlite.JDBC");
          
          String url = "jdbc:mysql://localhost:3307/102366_oop1";
          String user = "root", pass = "mshamba";
          
          /**
             * Open connection
             */
          
          Connection conn = DriverManager.getConnection(url,user,pass);
          
          return conn;  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}
