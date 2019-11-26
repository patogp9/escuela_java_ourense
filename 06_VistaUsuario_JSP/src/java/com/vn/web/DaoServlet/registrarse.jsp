<%-- 
    Document   : index
    Created on : 21-feb-2019, 20:42:40
    Author     : IEUser
--%>
<%@include file="head.jsp" %>
<html>
    <%=head()%>
    <body>
        <%@include file="header.jsp" %>
        <h1>Formulario JSP de registro</h1> 
        <form name="form1" action="usuarios.do" method="post">

            <table border="1">
                <tr><td>Nombre:</td><td>
                        <input type="text" name="nombre" id="nombre" size="25" value="" placeholder="Introduce nombre" required="required" pattern="^[A-Z][a-z]+ ?[A-Za-z]*$"/>  </td></tr>
                <tr><td>Edad:</td><td>
                        <input type="number" name="edad" id="edad" value="" placeholder="Introduce edad" required="required" min="12"/>  </td></tr> 
               <tr><td>Email</td><td>
                        <input type="email" name="email" id="email" value="" placeholder="Introduce email" required="required" pattern="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$"/>  </td></tr> 
                <tr><td>Contraseņa</td><td>
                        <input type="password" name="password" id="password" value="" placeholder="Introduce contraseņa" required="required" minlength="4"/>  </td></tr> 
            </table>
            <input type="submit" value="Registrarse"/>
        </form>
    </body>
</html>