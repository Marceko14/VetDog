/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author nicolas
 */
public class conexionBD {
    //CONEXION A LA BASE DE DATOS
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/";
    private final String DATABASE = "veterinaria_vetdog";
    private final String USER = "root";
    private final String PASSWORD = "Master12@";
    
    //CONSTRUCTOR VACIO PARA LA CONEXION

    
    
    
    //CREAMOS UN METODO PARA LA CONEXION DE LA BASE DE DATOS
    public Connection conected(){
        Connection sql = null;
        try{
            Class.forName(DRIVER);
            sql = DriverManager.getConnection(URL+DATABASE,USER,PASSWORD);
            
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
    
        }
        return sql;
    
    }
    
    public void disconected(Connection sql){
        if (sql != null){
            try{
                sql.close();
            
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            
            }
            
        }
    }
    
    
}
