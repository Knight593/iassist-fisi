package com.pirux.tesis.service.response;

import com.pirux.tesis.model.Tutor;

/**
 * Modelo de la data de respuesta para el logueo del tutor
 */
public class LoginResponse {
	private Tutor tutor;

	public Tutor getUsuario() {
		return tutor;
	}

	public void setUsuario(Tutor tutor) {
		this.tutor = tutor;
	}
	
	
}
