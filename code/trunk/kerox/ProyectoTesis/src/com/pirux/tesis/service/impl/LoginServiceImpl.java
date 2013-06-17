package com.pirux.tesis.service.impl;

import com.pirux.tesis.dao.UsuarioDAO;
import com.pirux.tesis.model.Usuario;
import com.pirux.tesis.service.LoginService;
import com.pirux.tesis.service.request.LoginRequest;
import com.pirux.tesis.service.response.LoginResponse;

/**
 * Implementacion del servicio del tutor
 */
public class LoginServiceImpl implements LoginService {

	private UsuarioDAO usuarioDAO;
	
	@Override
	public LoginResponse loguear(LoginRequest request) {
		LoginResponse response = new LoginResponse();
		Usuario usuario = usuarioDAO.buscarUsuario(request.getUsuario(), request.getPassword());
		response.setUsuario(usuario);
		return response;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}
	
	
}
