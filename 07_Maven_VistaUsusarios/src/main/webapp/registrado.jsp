<%-- 
    Document   : registrado
    Created on : 21-feb-2019, 23:21:10
    Author     : IEUser
--%>
<%@page import="com.appusuarios.modelo.Usuario"%>
<%@page import="com.appusuarios.modelo.logica.ServicioUsuarios"%>
<%
ServicioUsuarios servicioU = (ServicioUsuarios)request.getAttribute("servicioUsu");
Usuario u = (Usuario)session.getAttribute("usuario");
%>
<html>
    <body>
        <h1>Registrado correctamente</h1>
        <h2 style="color:green;">
            ID:<%= servicioU.leerUno(u.getEmail()).getId() %><br/>
            NOMBRE:<%= servicioU.leerUno(u.getEmail()).getNombre() %>
        </h2>
    </body>
</html>
