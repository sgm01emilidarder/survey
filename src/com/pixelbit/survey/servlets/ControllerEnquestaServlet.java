package com.pixelbit.survey.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Aquest servlet farà de contolador central de tota l'aplicació (DispatcherServlet)
 */
@WebServlet("/controller-enquesta")
public class ControllerEnquestaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerEnquestaServlet() {
        super();        
    }

    // Funció auxiliar per a comprobar si un enter és numèric
    public static boolean isNumeric(String str) {
        // null or empty
        if (str == null || str.length() == 0) return false;
        // Comprova que tots els dígits són enters
        return str.chars().allMatch(Character::isDigit);
    }
    
    /**
     * Mètode que recupera les dades dels formularis codi-empresa i tipus-enquesta per posteriorment 
     * redirigir les dades
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Recuperam camps ocults
		String sCodiEmpresa = request.getParameter("codi-empresa");
		String sTipusEnquesta = request.getParameter("tipus-enquesta");
		
		// Comprovar si s'ha passat correctament el format de codi d'empresa
		if (sCodiEmpresa !=null && isNumeric(sCodiEmpresa)) {
			Integer codiEmp = Integer.parseInt(sCodiEmpresa); 
			
			String urlNextServlet = (sTipusEnquesta.equals("enq-politica"))?"/enquesta-politica":"/enquesta-formacio";
			
			// Rediregint la resposta a l'enquesta corresponent afegint el codi d'empresa a la sol·licitud 
			request.setAttribute("codiEmp", codiEmp);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(urlNextServlet);
			dispatcher.forward(request,response);
			
		}else {
			  // Exemple de com imprimir la resposta a la petició HTML directament des del servlet
			  // En aquest cas un avís quan no s'ha passat per paràmetre el codi d'empresa correctament
			  response.setContentType("text/html");
			  PrintWriter out = response.getWriter();
			  out.println("<html>");
			  out.println("<head>");
			  out.println("</head>");
			  out.println("<body>");
			  out.println(" <div>");
			  out.println("    <h2> Aquesta enquesta no pertany a cap empresa</h2>");
			  out.println(" </div>");
			  out.println("</body>");
			  out.println("</html>");		
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		// Si les dades entre pel mètode post redirigim cap a get
		doGet(request, response);
	}

}
