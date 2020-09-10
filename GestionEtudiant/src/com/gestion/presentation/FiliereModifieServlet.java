package com.gestion.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestion.dao.FiliereDAO;
import com.gestion.entities.Filiere;

/**
 * Servlet implementation class FiliereModifieServlet
 */
@WebServlet("/FiliereModifieServlet")
public class FiliereModifieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FiliereModifieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Filiere filiere = new FiliereDAO().getFiliere(id);
		request.setAttribute("filiere", filiere);
		
		RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/modifierfilier.jsp");  
		rd.forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String intitule = request.getParameter("intitule");
	
		
		Filiere filiere = new Filiere(id, intitule);

		new FiliereDAO().updateFiliere(filiere);
		response.sendRedirect("ListEtudiantServlet");
	}

}
