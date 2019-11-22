<%-- 
    Document   : lista_bdd
    Created on : 22-nov-2019, 11:23:59
    Author     : PC
--%>

<%@page import="java.util.List"%>
<%@page import="com.vn.appweb.servlets.ConsultaSQL"%>
<%@page import="com.vn.appweb.servlets.DatosPersona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de pinchas en JSP con DerbyDB</title>
    </head>
    <body>
        <h1>Listado desde JSP</h1>
        <%
            String busq = request.getParameter("nombre_busq");
            if(busq==null)
                busq="";
            out.println("<p>Hola desde java en URL" + request.getContextPath() + "</p>");

            ConsultaSQL sql = new ConsultaSQL();
            List<DatosPersona> ldp = sql.leerTabla(busq);

        %>
        
        <form name='formbusq' method='GET' action='./lista_bdd.jsp'>
            <input name="nombre_busq" type="text" placeholder="Introduzca una busqueda" size="40"/>
            <input type="submit" value="submit"/>
        </form>
        <table>
            <thead>
            <th>Nombre</th><th>Email</th>
        </thead>

        <%            
            for (DatosPersona dp : ldp) {
        %>
            <tr>
                <td><% out.print(dp.getNombre()); %></td>
                <td><% out.print(dp.getEmail()); %></td>
            <tr>
            <%
                }
            %>
        </tr>
    </table>
</body>
</html>