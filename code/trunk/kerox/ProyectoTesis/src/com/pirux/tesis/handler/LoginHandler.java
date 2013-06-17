package com.pirux.tesis.handler;

import com.pirux.tesis.service.LoginService;
import com.pirux.tesis.service.request.LoginRequest;
import com.pirux.tesis.service.response.LoginResponse;

/**
 * Handler para el logueo del tutor
 */
public class LoginHandler {

	private LoginService loginService;
	private String usuario;
	private String password;
	
	public LoginHandler(final LoginService loginService) {
		this.loginService = loginService;
	}
	
	public LoginResponse ejecutar() {
		try{
			LoginRequest request = new LoginRequest();
			request.setUsuario(usuario);
			request.setPassword(password);
			LoginResponse response = loginService.loguear(request);
			return response;
		} catch(Exception e){
			return null;
		}
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
