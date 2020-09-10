package com.gestion.presentation;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestion.dao.EtudiantDAO;

import com.gestion.entities.Etudiant;


/**
 * Servlet implementation class EtudiantModifierServlet
 */
@WebServlet("/EtudiantModifierServlet")
public class EtudiantModifierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EtudiantModifierServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	

	
		
		
		long id = Integer.parseInt(request.getParameter("id"));
		Etudiant etudiant = new EtudiantDAO().getEtudiant(id);
		request.setAttribute("etudiant", etudiant);
		
		//ArrayList<Filiere> listeFilieres = (ArrayList<Filiere>) new FiliereDAO().getAllFiliere();
		//request.setAttribute("listeFilieres", listeFilieres);
		
		RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/modifieretudiant.jsp");  
		rd.forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
		
		long id = Long.parseLong(request.getParameter("id"));
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		long cne = Long.parseLong(request.getParameter("cne"));
		long apogee = Long.parseLong(request.getParameter("apogee"));
		int idFiliere = Integer.parseInt(request.getParameter("idFiliere"));
		
		Etudiant etudiant = new Etudiant(id,nom,prenom,email,cne,apogee,idFiliere);
		
		EtudiantDAO ed = new EtudiantDAO();
		
		ed.updateEtudiant(etudiant);

		//new EtudiantDAO.updateEtudiant(etudiant);
		
		response.sendRedirect("ListEtudiantServlet");
	}

}
