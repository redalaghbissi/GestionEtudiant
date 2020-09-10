package com.gestion.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestion.dao.EtudiantDAO;
import com.gestion.entities.Etudiant;
import com.gestion.entities.Filiere;

/**
 * Servlet implementation class AjouterEtudiantServlet
 */
@WebServlet("/AjouterEtudiantServlet")
public class AjouterEtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterEtudiantServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/ajouteretudiant.jsp");  
		rd.forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//long id = Long.parseLong(request.getParameter("id"));
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		long cne = Long.parseLong(request.getParameter("cne"));
		long apogee = Long.parseLong(request.getParameter("apogee"));
		
		int idFiliere = Integer.parseInt(request.getParameter("idFiliere"));
		
		
		Etudiant etudiant = new Etudiant(0,nom,prenom,email,cne,apogee,idFiliere);
		System.out.println(etudiant);
		new EtudiantDAO().addEtudiant(etudiant);
		response.sendRedirect("ListEtudiantServlet");
		System.out.println("Appel de doPost");
	}

}
