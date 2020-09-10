<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.gestion.entities.Filiere" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Le styles -->
<link href="static/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<%
			Filiere f = (Filiere)request.getAttribute("filiere");
%>
<form method="post" action="FiliereModifieServlet?id=<%=f.getId()  %>">

  
    <div class="form-group">
    <label >Nom Filiere</label>
    <input type="text" name="intitule" class="form-control" id="intitule" placeholder="Entrer le nom du filier">
  	</div>
    
  <button type="submit" class="btn btn-primary">Ajouter</button>
</form>
</body>
</html>