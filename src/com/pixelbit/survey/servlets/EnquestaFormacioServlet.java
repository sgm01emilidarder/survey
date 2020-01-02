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
import com.pixelbit.survey.pojo.EnquestaFormacio;
import com.pixelbit.survey.pojo.Entrevistat;
import com.pixelbit.survey.pojo.Pregunta;
import com.pixelbit.survey.service.EmpresaService;


@WebServlet("/enquesta-formacio")
public class EnquestaFormacioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EnquestaFormacioServlet() {  super();  }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Dins enquesta de formació");
		
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
		
		// Configuram llista de preguntes
		Pregunta preg1 = new Pregunta("Quin partit polític creus que guanyarà a les próximes eleccions?", respostaPreg1);
		Pregunta preg2 = new Pregunta("Quin partit t'agradaria que guanyàs?", respostaPreg2);
		
		HashSet<Pregunta> llistaPreguntes = new HashSet<Pregunta>();
		llistaPreguntes.add(preg1);
		llistaPreguntes.add(preg2);
		
		// Recorrer dades de programacio amb foreach:
		String[] aCheckboxEstudis = request.getParameterValues("lag-programing");	
		
		// Dades de l'empresa contractadora de l'enquesta
		EmpresaService service = new EmpresaService();
		Empresa empresa = service.getEmpresa( (Integer) request.getAttribute("codiEmp") );
						
		// Configuram l'enquesta amb totes les dades
		EnquestaFormacio enq = new EnquestaFormacio(empresa, entrevistat, llistaPreguntes, aCheckboxEstudis);
		
	
		List<Enquesta> llistaEnquestes = (ArrayList<Enquesta>) request.getSession().getAttribute("llistaEnquestes");
		if (llistaEnquestes == null) {
			llistaEnquestes = new ArrayList<Enquesta>();
		}
		llistaEnquestes.add(enq);
		
		request.getSession().setAttribute("llistaEnquestes", llistaEnquestes);			
		request.setAttribute("tipusEnquesta", "Enquesta Formació");	
		
		
		System.out.println(enq.getEntrevistat().toString());
		request.setAttribute("enquesta", enq);	
		
		request.getRequestDispatcher("inf-enquesta-formacio.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
