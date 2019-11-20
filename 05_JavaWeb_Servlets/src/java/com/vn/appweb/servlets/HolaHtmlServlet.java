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
public class HolaHtmlServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter salida = response.getWriter()) {
            salida.print("<html>"
                    + "<head>"
                    + " <link rel='stylesheet' type='text/css' href='/AppWebServlets/saludos/hola.css'>"
                    + "<title>Web HTML desde Servlet</title>"
                    + "</head>"
                    + "<body>"
                    + "<h1 class='tonto'>Heyyyyyy</h1>"
                    + "<h2 class='tonto'>Hola que pasa</h2>"
                    + "<ul>");
                    for(int i = 0; i<10;i++){
                        salida.print("<li id='ashnikko_"+i+"'> Rodriguez "+(i+1)+"</li>");
                    }
                    salida.print( "</ul>"
                    + "</body>"
                    + "</html>");
        }
    }
}
