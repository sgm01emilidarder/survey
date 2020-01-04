package com.pixelbit.survey.pojo;

import java.io.Serializable;
import java.util.HashSet;


public class EnquestaRegals extends Enquesta implements Serializable{
    private static final long serialVersionUID = 665848077020986921L;

    private String observacions;

    public EnquestaRegals() {
        super();
    }

    public EnquestaRegals(Empresa empresaEnquesta, Entrevistat personaEntrevistada, HashSet<Pregunta> preguntes, String observacions) {
        super(empresaEnquesta, personaEntrevistada, preguntes);
        this.observacions = observacions;
    }

    public String getObservacions() {
        return observacions;
    }

    public void setObservacions(String[] opcionsRegals) {
        this.observacions = observacions;
    }


}

