<%@ page import="com.gestion.entities.Etudiant" %>
<%@ page import="com.gestion.entities.Filiere" %>
<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- Le styles -->
<link href="static/css/bootstrap.css" rel="stylesheet">
</head>
<body>
	<h1 class="text-center" >Gestion des etudiants</h1>
	
	<%
		Collection<Etudiant> etudiants = (Collection<Etudiant>)request.getAttribute("etudiants");
	%>
	
	<p>Ajouter une Etudiant : <a href="AjouterEtudiantServlet" class="btn btn-primary">Créer</a> </p>
	
	<table class="table" width="100%" border="1">
		<tr>
			<th>ID</th><th>NOM</th><th>PRENOM</th><th>EMAIL</th><th>CNE</th><th>APOGEE</th><th>IDFILIERE</th>
		</tr>
		<%
			for(Etudiant etudiant : etudiants){
		%>
		<tr>
			<td><%=etudiant.getId() %></td><td><%=etudiant.getNom() %></td><td><%=etudiant.getPrenom() %></td><td><%=etudiant.getEmail() %></td><td><%=etudiant.getCne() %></td><td><%=etudiant.getApogee() %></td><td><%=etudiant.getIdFiliere() %></td><td><a href="EtudiantModifierServlet?id=<%=etudiant.getId() %>" class="btn btn-success">Modifier</a> <a href="SupprimerEtudiantServlet?id=<%=etudiant.getId() %>" class="btn btn-danger">Supprimer</a></td>
		</tr>		
		<%
			}
		%>
		
		
		
		
		
		
		</table>
		
			<h1 class="text-center">Gestion des filieres</h1>
	
	<%
		Collection<Filiere> filieres = (Collection<Filiere>)request.getAttribute("filieres");
	%>
	
	<p>Ajouter une filier : <a href="AjouterFiliereServlet" class="btn btn-primary">Créer</a></p>
	
	<table class="table" width="100%" border="1">
		<tr>
			<th>ID</th><th>NOM</th>
		</tr>
		<%
			for(Filiere filiere : filieres){
		%>
		<tr>
			<td><%=filiere.getId() %></td><td><%=filiere.getIntitule() %></td><td><a href="FiliereModifieServlet?id=<%=filiere.getId() %>" class="btn btn-success">Modifier</a> <a href="SupprimerFiliereServlet?id=<%=filiere.getId() %>" class="btn btn-danger">Supprimer</a></td>
		</tr>		
		<%
			}
		%>
	</table>
	
	
</body>
</html>