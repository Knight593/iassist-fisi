package com.pirux.tesis.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.pirux.tesis.handler.LoginHandler;
import com.pirux.tesis.model.Tutor;
import com.pirux.tesis.service.response.LoginResponse;
import com.pirux.tesis.util.ConstantesFlowPage;

/**
 * Controla la Sesion del tutor
 */
@ManagedBean
@SessionScoped
public class TutorSesionBean {
  private String nombre;
  private String cargo;
  private String interes;
  private String rutaImagen;
  private String usuario;
  private String password;
  private String mail;
  private boolean sesionActiva;

  // Handler de Logueo
  private LoginHandler tutorLoginHandler;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(final String usuario) {
    this.usuario = usuario;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(final String password) {
    this.password = password;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(final String mail) {
    this.mail = mail;
  }

  public boolean isSesionActiva() {
    return sesionActiva;
  }

  public void setSesionActiva(final boolean sesionActiva) {
    this.sesionActiva = sesionActiva;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(final String cargo) {
    this.cargo = cargo;
  }

  public String getInteres() {
    return interes;
  }

  public void setInteres(final String interes) {
    this.interes = interes;
  }

  public String getRutaImagen() {
    return rutaImagen;
  }

  public void setRutaImagen(final String rutaImagen) {
    this.rutaImagen = rutaImagen;
  }

  public String loguear() {
    // Implementacion del logueo
    tutorLoginHandler.setUsuario(usuario);
    // Encriptar Contraseña
    // password = DigestUtils.md5Hex(password);
    tutorLoginHandler.setPassword(password);
    final LoginResponse response = tutorLoginHandler.ejecutar();
    if (response != null) {
      final Tutor tutor = response.getUsuario();
      if (tutor != null) {
        sesionActiva = true;
        nombre = tutor.getNombre();
        mail = tutor.getCorreo();
        cargo = tutor.getCargo();
        interes = tutor.getInteres();
        rutaImagen = "/imagenes/David.jpg";
        return ConstantesFlowPage.GO_PAGINA_TUTOR_HOME;
      }
      return null;
    }
    return null;
  }

  public void setTutorLoginHandler(final LoginHandler tutorLoginHandler) {
    this.tutorLoginHandler = tutorLoginHandler;
  }
}
