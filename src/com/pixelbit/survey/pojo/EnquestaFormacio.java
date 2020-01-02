package com.pixelbit.survey.pojo;

import java.io.Serializable;
import java.util.HashSet;


public class EnquestaFormacio extends Enquesta implements Serializable{
	private static final long serialVersionUID = 665848077020956921L;
	
	String[] opcionsEstudis;
	
	public EnquestaFormacio() {
		super();		
	}
	
	public EnquestaFormacio(Empresa empresaEnquesta, Entrevistat personaEntrevistada, HashSet<Pregunta> preguntes, String[] opcionsEstudis) {
		super(empresaEnquesta, personaEntrevistada, preguntes);
		this.opcionsEstudis = opcionsEstudis;
	}

	public String[] getOpcionsEstudis() {
		return opcionsEstudis;
	}

	public void setOpcionsEstudis(String[] opcionsEstudis) {
		this.opcionsEstudis = opcionsEstudis;
	}


}
