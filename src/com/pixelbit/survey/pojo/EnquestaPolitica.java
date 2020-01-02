package com.pixelbit.survey.pojo;

import java.io.Serializable;
import java.util.HashSet;

public class EnquestaPolitica extends Enquesta implements Serializable{
	private static final long serialVersionUID = 1917945959444883952L;
	
	private String observacions;

	public EnquestaPolitica() {
		super();		
	}
	
	public EnquestaPolitica(Empresa empresaEnquesta, Entrevistat personaEntrevistada, HashSet<Pregunta> preguntes, String observacions) {
		super(empresaEnquesta, personaEntrevistada, preguntes);
		this.observacions = observacions;
	}

	public EnquestaPolitica(String observacions) {
		this.observacions = observacions;
	}

	public String getObservacions() {
		return observacions;
	}

	public void setObservacions(String observacions) {
		this.observacions = observacions;
	}
	

}
