package com.pirux.tesis.service.impl;

import com.pirux.tesis.dao.TutorDAO;
import com.pirux.tesis.model.Tutor;
import com.pirux.tesis.service.LoginService;
import com.pirux.tesis.service.request.LoginRequest;
import com.pirux.tesis.service.response.LoginResponse;

/**
 * Implementacion del servicio del tutor
 */
public class LoginServiceImpl implements LoginService {

  private TutorDAO tutorDAO;

  @Override
  public LoginResponse loguear(final LoginRequest request) {
    final LoginResponse response = new LoginResponse();
    final Tutor tutor = tutorDAO.buscarUsuario(request.getUsuario(), request.getPassword());
    response.setUsuario(tutor);
    return response;
  }

  public void setTutorDAO(final TutorDAO tutorDAO) {
    this.tutorDAO = tutorDAO;
  }

}
