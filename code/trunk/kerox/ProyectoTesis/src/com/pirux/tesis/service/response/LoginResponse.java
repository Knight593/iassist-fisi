package com.pirux.tesis.service.response;

import com.pirux.tesis.model.Usuario;

/**
 * Modelo de la data de respuesta para el logueo del tutor
 */
public class LoginResponse {
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
