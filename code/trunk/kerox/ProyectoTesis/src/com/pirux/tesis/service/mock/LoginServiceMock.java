package com.pirux.tesis.service.mock;

import com.pirux.tesis.model.Tutor;
import com.pirux.tesis.service.LoginService;
import com.pirux.tesis.service.request.LoginRequest;
import com.pirux.tesis.service.response.LoginResponse;

/**
 * Service mock de logueo
 */
public class LoginServiceMock implements LoginService {

  @Override
  public LoginResponse loguear(LoginRequest request) {
    final LoginResponse response = new LoginResponse();
    final Tutor tutor = new Tutor();
    tutor.setNombre("David Cabanillas Murrugarra");
    tutor.setCorreo("dmoises.cm@gmail.com");
    tutor.setCargo("Software Engineer I en Avantica Technologies");
    tutor.setInteres("Interesado en JAVA, Business Intelligence y Master in Business Administration");
    response.setUsuario(tutor);
    return response;
  }

}
