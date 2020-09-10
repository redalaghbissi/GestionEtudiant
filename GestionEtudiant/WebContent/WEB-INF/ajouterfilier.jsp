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


<h1>Ajouter une filiere</h1>
<form method="post" action="AjouterFiliereServlet">
  
    <div class="form-group">
    <label >Nom Filiere</label>
    <input type="text" name="intitule" class="form-control" id="intitule" placeholder="Entrer le nom du filier">
  	</div>
    
  <button type="submit" class="btn btn-primary">Ajouter</button>
</form>
</body>
</html>