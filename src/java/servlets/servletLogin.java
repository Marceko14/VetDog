/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import model.UsuarioDAO;
import model.Usuarios;




@WebServlet(name = "servletLogin", urlPatterns = {"/servletLogin"})
public class servletLogin extends HttpServlet {
    
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    Usuarios users = new Usuarios();
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("action");
        String user = request.getParameter("user");
        String email = request.getParameter("correo");
        String clave = request.getParameter("password");
       
        try {
            users = usuarioDAO.insertar(user, email, clave);
        } catch (SQLException ex) {
            Logger.getLogger(servletLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (accion.equalsIgnoreCase("Ingresar")) {
            if (users.getUsuario() != null) {
                request.getRequestDispatcher("").forward(request, response);
                
            }
            else{
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
            
        }
        
        
       
       
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
