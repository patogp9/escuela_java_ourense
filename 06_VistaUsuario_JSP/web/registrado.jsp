<%-- 
    Document   : registrado
    Created on : 21-feb-2019, 23:21:10
    Author     : IEUser
--%>
<%@page import="com.appusuarios.modelo.logica.ServicioUsuarios"%>
<html>
    <body>
        <h1>Registrado correctamente</h1>
        <h2 style="color:green;">
            ID:<%= (new ServicioUsuarios().leerUno(session.getAttribute("emailUsuario").toString()).getId()) %><br/>
            NOMBRE:<%= (new ServicioUsuarios().leerUno(session.getAttribute("emailUsuario").toString()).getNombre()) %>
        </h2>
    </body>
</html>