<%-- 
    Document   : index
    Created on : 21-feb-2019, 20:42:40
    Author     : IEUser
--%>
<%@page import="com.appusuarios.modelo.logica.ServicioUsuarios"%>
<%@page import="com.appusuarios.modelo.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@include file="head.jsp"%>
<%!ArrayList<Usuario> todosUsuario = new ArrayList();%>
<%
	ServicioUsuarios srvUsu = new ServicioUsuarios();
	todosUsuario = srvUsu.leerTodos();
%>
<html>
<%=head()%>
<body>
	<%@include file="header.jsp"%>
	<h1>Todos los usuarios</h1>
	<div border="2">
<% for (Usuario u : todosUsuario) { %>
		<form action="usuarios.do" method="post" name="form">
			<input id="id" name="id" type="text" size="4" readonly="true" value="<%=u.getId()%>" /> 
			<input id="nombre" name="nombre" type="text" required="true" value="<%=u.getNombre()%>" />
			<input id="edad" name="edad" type="number" required="true" size="4" value="<%=u.getEdad()%>" /> 
			<input id="email" name="email" type="email" required="true" value="<%=u.getEmail()%>" /> 
			<input id="password" name="password" type="password" required="true" value="<%=u.getPassword()%>" />
		    <input class="method" id="method" name="method" type="text" size="4" readonly="true" value="PUT" />
		    <input type="submit" value="EDIT" onclick="Array.from(document.getElementsByClassName('method')).forEach((thisInput) => { thisInput.value='PUT'; })" />
			<input type="submit" value="ELIM" onclick="Array.from(document.getElementsByClassName('method')).forEach((thisInput) => { thisInput.value='DELETE'; })" /><br />
		</form>
	<% } %>
	</div>
</body>
</html>