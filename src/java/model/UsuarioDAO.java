/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexion.conexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UsuarioDAO {
    conexionBD conected = new conexionBD();
    Connection con;
    PreparedStatement ps;
    
    
    public Usuarios insertar(String user, String email, String clave) throws SQLException{
        Usuarios users = new Usuarios();
        con = null;
        String sql = "INSERT INTO Usuarios(usuario, email,clave) VALUES(?,?,?)";
        
        try{
            con = conected.conected();
            con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, email);
            ps.setString(3, clave);
            ps.executeUpdate();
            
            
        }
        catch(SQLException e){
            if (con != null) {
                ps.close();
                
            }
        }
        return users;
            
            
        }
    
    
    }
    
    
    
    
    
