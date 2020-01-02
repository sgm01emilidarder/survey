package com.pixelbit.survey.service;

import java.util.HashMap;
import java.util.Map;
import com.pixelbit.survey.pojo.Empresa;

public class EmpresaService {
	
	private Map<Integer, Empresa> llistaEmpreses = new HashMap<>();

	public EmpresaService() {
		// Dades de prova
		llistaEmpreses.put(1, new Empresa(1, "X45672323J", "El País", "") );
		llistaEmpreses.put(2, new Empresa(2, "H45342312F", "Gorven de les Illes Balears", "") );
	}
	
	public Map<Integer, Empresa> getLlistaEmpresa() {
		return llistaEmpreses;
	}
	
	public Empresa getEmpresa(Integer id) {
		return this.llistaEmpreses.get(id);
	}
	
}
