package com.pixelbit.survey.pojo;

import java.util.HashSet;

public abstract class Enquesta {
	long id;
	Entrevistat entrevistat;
	Empresa empresaEnquesta;
	HashSet<Pregunta> preguntes;
	
	public Enquesta() {
	}
	
	public Enquesta(Empresa empresaEnquesta, Entrevistat personaEntrevistada, HashSet<Pregunta> preguntes) {
		this.entrevistat = personaEntrevistada;
		this.empresaEnquesta = empresaEnquesta;
		this.preguntes = preguntes;
	}

	public Enquesta(long id, Entrevistat personaEntrevistada, Empresa empresaEnquesta, HashSet<Pregunta> preguntes) {
		this.id = id;
		this.entrevistat = personaEntrevistada;
		this.empresaEnquesta = empresaEnquesta;
		this.preguntes = preguntes;
	}



	public Entrevistat getEntrevistat() {
		return entrevistat;
	}

	public void setEntrevistat(Entrevistat entrevistat) {
		this.entrevistat = entrevistat;
	}

	public Empresa getEmpresaEnquesta() {
		return empresaEnquesta;
	}


	public void setEmpresaEnquesta(Empresa empresaEnquesta) {
		this.empresaEnquesta = empresaEnquesta;
	}


	public HashSet<Pregunta> getPreguntes() {
		return preguntes;
	}


	public void setPreguntes(HashSet<Pregunta> preguntes) {
		this.preguntes = preguntes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Enquesta))
			return false;
		Enquesta other = (Enquesta) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
	

}
