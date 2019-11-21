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
        double increment = 0.1,fontsize=1.1;
        try (PrintWriter salida = response.getWriter()) {
            salida.println(".tonto{\ncolor:aqua!important;\n}\n");
            salida.println("body{\nbackground-color:black;\n}\n");
            salida.println("ul{\nbackground-color:mediumvioletred;\n}\n\nli{\ncolor:honeydew;\n}\n");
            for(int i = 0; i<10;i++){
                salida.println("#ashnikko_"+i+"{\nfont-size:"+fontsize+"em; \nfont-family:'Courier New', Courier, monospace;\n}\n");
                fontsize+=increment;
            }
        }
    }
}
