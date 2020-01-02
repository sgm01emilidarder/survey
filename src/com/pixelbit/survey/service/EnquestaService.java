package com.pixelbit.survey.service;

import java.util.ArrayList;

import com.pixelbit.survey.pojo.Enquesta;

/*
 * TODO Insertar i recuperar les enquestes en base de dades
 * */
public class EnquestaService {
	
	ArrayList<Enquesta> llistaEnquestes =new ArrayList<Enquesta>();

	public EnquestaService() {
		
	}

	public ArrayList<Enquesta> getLlistaEnquestes() {
		return llistaEnquestes;
	}

	public void setLlistaEnquestes(ArrayList<Enquesta> llistaEnquestes) {
		this.llistaEnquestes = llistaEnquestes;
	}

	
}
