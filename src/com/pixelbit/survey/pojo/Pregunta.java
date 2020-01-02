package com.pixelbit.survey.pojo;

import java.io.Serializable;

public class Pregunta implements Serializable{
	private static final long serialVersionUID = 4334016319917761403L;
	
	String descripcio;
	String resposta;
	
	
	public Pregunta() {
	}


	public Pregunta(String pregunta, String resposta) {
		this.descripcio = pregunta;
		this.resposta = resposta;
	}


	public String getDescripcio() {
		return descripcio;
	}


	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}


	public String getResposta() {
		return resposta;
	}


	public void setResposta(String resposta) {
		this.resposta = resposta;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcio == null) ? 0 : descripcio.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Pregunta)) {
			return false;
		}
		Pregunta other = (Pregunta) obj;
		if (descripcio == null) {
			if (other.descripcio != null) {
				return false;
			}
		} else if (!descripcio.equals(other.descripcio)) {
			return false;
		}
		return true;
	}
	
	

}
