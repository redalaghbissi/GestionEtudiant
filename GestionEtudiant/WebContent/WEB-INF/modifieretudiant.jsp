<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.gestion.entities.Etudiant" %>
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
			Etudiant e = (Etudiant)request.getAttribute("etudiant");
%>
<h1>modifier un etudiant</h1>
<form method="post" action="EtudiantModifierServlet?id=<%=e.getId()  %>">
  
    <div class="form-group">
    <label >Nom</label>
    <input type="text" name="nom" class="form-control" id="nom" placeholder="Entrer le nom">
  </div>
    <div class="form-group">
    <label >prenom</label>
    <input type="text" name="prenom" class="form-control" id="prenom" placeholder="Entrer le prenom">
  </div>
    <div class="form-group">
    <label >email</label>
    <input type="text" name="email" class="form-control" id="email" placeholder="Entrer le email">
  </div>
    <div class="form-group">
    <label >cne</label>
    <input type="text" name="cne" class="form-control" id="cne" placeholder="Entrer le cne">
  </div>
  <div class="form-group">
    <label >apogee</label>
    <input type="text" name="apogee" class="form-control" id="apogee" placeholder="Entrer le apogee">
  </div>
  <div class="form-group">
    <label >idFiliere</label>
    <input type="text" name="idFiliere" class="form-control" id="idFiliere" placeholder="Entrer le idFiliere">
  </div>
  <button type="submit" class="btn btn-primary">Ajouter</button>
</form>


</body>
</html>