/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexion;
import conexion.conexionBD;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author nicolas
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        conexionBD conexionBD1 = new conexionBD();
        Connection sql = conexionBD1.conected();
        if (sql != null) {
            JOptionPane.showMessageDialog(null, "BASE DE DATOS CONECTADO");
            System.out.println("la base de datos esta conectado");
            
            
        } else {
            System.out.println("la base de datos esta desconectado");
        }
    }
    
}
