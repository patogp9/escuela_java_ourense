/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
public class ParamServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ParaServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ParaServlet at " + request.getContextPath() + "</h1>");
            out.println("<form name ='formDatos' action='./formulario' method='POST'>");
            out.println("<label> Nombre: </label>");
            out.println("<input id='nombre_campo' name='nombre_campo' required/>");
            out.println("<label> Email: </label>");
            out.println("<input id='email' name='email' type='email' required/>");
            out.println("<input type='submit' value='Enviar'/>");
//            String valorCampo = request.getParameter("nombre_campo");
//            if (valorCampo == null ) {
//                out.print("<p style='color:red;'>No hay parametro</p>");
//            } else {
//                out.print("<p style='color:green;'>parametro ok: " + valorCampo + "</p>");
//            }
//            String valorMail = request.getParameter("email");
//            String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
//            if (valorMail == null ) {
//                out.print("<p style='color:red;'>No hay parametro</p>");
//            } else {
//                if (valorMail.matches(regex)) {
//                    out.print("<p style='color:green;'>parametro ok: " + valorMail + "</p>");
//                } else {
//                    out.print("<p style='color:red;'>"+valorMail+" no es un mail válido</p>");
//                }
//            }
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ParaServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ParaServlet at " + request.getContextPath() + "</h1>");
            
            String nombre = request.getParameter("nombre_campo");
            if (nombre == null ) {
                out.print("<p style='color:red;'>No hay parametro</p>");
            } else {
                out.print("<p style='color:green;'>parametro ok: " + nombre + "</p>");
            }
            String email = request.getParameter("email");
            String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
            if (email == null ) {
                out.print("<p style='color:red;'>No hay parametro</p>");
            } else {
                if (email.matches(regex)) {
                    out.print("<p style='color:green;'>parametro ok: " + email + "</p>");
                } else {
                    out.print("<p style='color:red;'>"+email+" no es un mail válido</p>");
                }
            }
           // Vamos a insertar un rodriguez
           //jdbc:derby://localhost:1527/db_rodriguez
           try{
               Class.forName("org.apache.derby.jdbc.ClientDriver");
               DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
           } catch (Exception ex) {
                Logger.getLogger(ParamServlet.class.getName()).log(Level.SEVERE, null, ex);
                out.print("<p style='color:red;'>No se ha cargado DerbyDB</p>");
            }
           try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_rodriguez","root","1234")){
               String sqlQuery = "INSERT INTO PERSONA (nombre, email) VALUES ('"+nombre+"','"+email+"')";
               Statement sentenciaSQL = con.createStatement();
               sentenciaSQL.executeUpdate(sqlQuery);
           } catch (SQLException ex) {
               out.print("<p style='color:red;'>ERROR: "+ex.getMessage()+"</p>");
                Logger.getLogger(ParamServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            out.println("</body>");
            out.println("</html>");
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
