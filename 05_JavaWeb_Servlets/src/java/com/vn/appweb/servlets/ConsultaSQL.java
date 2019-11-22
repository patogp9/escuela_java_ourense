/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appweb.servlets;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class ConsultaSQL {

    public ConsultaSQL() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (Exception ex) {
            Logger.getLogger(ParamServlet.class.getName()).log(Level.SEVERE, null, ex);
            out.print("<p style='color:red;'>No se ha cargado DerbyDB</p>");
        }
    }

    public List<DatosPersona> leerTabla(String busq) {
        ArrayList<DatosPersona> datos = new ArrayList<>();
                
        try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_rodriguez", "root", "1234")) {
            String sqlQuery = "SELECT nombre, email FROM persona WHERE UPPER(TRIM(nombre)) LIKE ? ESCAPE '!' ";
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            busq = busq.toUpperCase().trim();
            busq = busq.replace("!", "!!");
            busq = busq.replace("%", "!%");
            busq = busq.replace("_", "!_");
            busq = busq.replace("[", "![");
            sentenciaSQL.setString(1, "%"+busq+"%");
            ResultSet resultado = sentenciaSQL.executeQuery();
            while (resultado.next()) {
                String nombre = resultado.getString(1);
                String email = resultado.getString(2);
                DatosPersona dp = new DatosPersona(nombre, email);
                datos.add(dp);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ParamServlet.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
        }
        
        return datos;
    }
}