package com.pirux.tesis.service;

import com.pirux.tesis.service.request.LoginRequest;
import com.pirux.tesis.service.response.LoginResponse;

/**
 * Interface del servicio del logueo del tutor
 */
public interface LoginService {
	
	LoginResponse loguear(LoginRequest request);
}
