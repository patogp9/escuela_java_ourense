/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * genera respuesta html
 *
 * @author PC
 */
public class HolaCSSServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/css");
        double increment = 0.15,fontsize=1.1;
        try (PrintWriter salida = response.getWriter()) {
            salida.print(".tonto{color:aqua!important;}");
            salida.print("body{background-color:black;}");
            salida.print("ul{background-color:mediumvioletred;} li{ color:honeydew;}");
            for(int i = 0; i<10;i++){
                salida.print("#ashnikko_"+i+"{font-size:"+fontsize+"em; font-family:'Courier New', Courier, monospace;}");
                fontsize+=increment;
            }
        }
    }
}
