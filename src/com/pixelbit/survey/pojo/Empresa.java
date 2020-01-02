package com.pixelbit.survey.pojo;

import java.io.Serializable;

public class Empresa implements Serializable{
	private static final long serialVersionUID = 2776416979798334855L;
	
	private int id;
	private String cif;
	private String nom;
	private String descripcio;
	

	public Empresa(int id) {
		this.id = id;
	}


	public Empresa(int id, String cif, String nom, String descripcio) {
		this.id = id;
		this.cif = cif;
		this.nom = nom;
		this.descripcio = descripcio;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCif() {
		return cif;
	}


	public void setCif(String cif) {
		this.cif = cif;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getDescripcio() {
		return descripcio;
	}


	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cif == null) ? 0 : cif.hashCode());
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
		if (!(obj instanceof Empresa)) {
			return false;
		}
		Empresa other = (Empresa) obj;
		if (cif == null) {
			if (other.cif != null) {
				return false;
			}
		} else if (!cif.equals(other.cif)) {
			return false;
		}
		return true;
	}
	
	

}
