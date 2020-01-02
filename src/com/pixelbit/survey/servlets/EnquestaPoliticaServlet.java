package com.pixelbit.survey.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pixelbit.survey.pojo.Empresa;
import com.pixelbit.survey.pojo.Enquesta;
import com.pixelbit.survey.pojo.EnquestaPolitica;
import com.pixelbit.survey.pojo.Entrevistat;
import com.pixelbit.survey.pojo.Pregunta;
import com.pixelbit.survey.service.EmpresaService;

/**
 * Controlador que recupera i valida les dades d'una enquesta política
 */
@WebServlet("/enquesta-politica")
public class EnquestaPoliticaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EnquestaPoliticaServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/* Per recuperar tots els paràmetres farem servir
		 * String [] allParameters = request.getParameterNames(); 
		 */
		System.out.println("Dins enquesta-politica");
		
		// Recuperam dades personals
		String tractament = request.getParameter("tractament");
		String dni = request.getParameter("dni");
		String nom = request.getParameter("nom");
		String llinatges = request.getParameter("llinatges");
		String email = request.getParameter("email");
		String telefon = request.getParameter("telefon");
		
		// Configuram objecte entrevistat
		Entrevistat entrevistat = new Entrevistat();
		entrevistat.setTractament(tractament);
		entrevistat.setDni(dni);
		entrevistat.setNom(nom);
		entrevistat.setLlinatges(llinatges);
		entrevistat.setEmail(email);
		entrevistat.setTelefon(telefon);
		
		// Recuperam dades de l'enquesta
		String respostaPreg1 = request.getParameter("pregunta-1");
		String respostaPreg2 = request.getParameter("pregunta-2");
		String observacions  = request.getParameter("observacions");
		
		// Configuram llista de preguntes
		Pregunta preg1 = new Pregunta("Quin partit polític creus que guanyarà a les próximes eleccions?", respostaPreg1);
		Pregunta preg2 = new Pregunta("Quin partit t'agradaria que guanyàs?", respostaPreg2);
		
		HashSet<Pregunta> llistaPreguntes = new HashSet<Pregunta>();
		llistaPreguntes.add(preg1);
		llistaPreguntes.add(preg2);
		
		// Dades de l'empresa contractadora de l'enquesta
		EmpresaService service = new EmpresaService();
		Empresa empresa = service.getEmpresa( (Integer) request.getAttribute("codiEmp") );
						
		// Configuram l'enquesta amb totes les dades
		EnquestaPolitica enq = new EnquestaPolitica(empresa, entrevistat, llistaPreguntes, observacions);
		
		// Es recupera el llistat d'enquestes fetes fins al moment de la sessió i s'afegeix la següent
		//------------------------------------------------------------------------------//
		@SuppressWarnings("unchecked")
		List<Enquesta> llistaEnquestes = (ArrayList<Enquesta>) request.getSession().getAttribute("llistaEnquestes");
		if (llistaEnquestes == null) {
			llistaEnquestes = new ArrayList<Enquesta>();
		}
		llistaEnquestes.add(enq);
		//------------------------------------------------------------------------------//
		
		// Actualtizam la sessió
		request.getSession().setAttribute("llistaEnquestes", llistaEnquestes);			
		request.setAttribute("tipusEnquesta", "Enquesta Política");	
		
		//System.out.println(enq.getEntrevistat().toString());
		
		// Redirigir les dades al JSP amb les dades de l'enquesta per mostrar a l'usuari
		request.setAttribute("enquesta", enq);				
		request.getRequestDispatcher("inf-enquesta-politica.jsp").forward(request, response);
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doGet(request, response);
	}

}
