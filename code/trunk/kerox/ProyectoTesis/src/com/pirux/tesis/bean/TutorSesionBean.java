package com.pirux.tesis.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

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
    if (password.equals("123")) {
      sesionActiva = true;
      nombre = "David Cabanillas Murrugarra";
      mail = "dmoises.cm@gmail.com";
      cargo = "Software Engineer I en Avantica Technologies";
      interes = "Interesado en JAVA, Business Intelligence y Master in Business Administration";
      rutaImagen = "/imagenes/David.jpg";
      // TODO dcabanillas: Crear una clase estatica que maneje los
      // llamados
      // en vez de retornar un valor, llamar a una funcion que retorne
      // dicho valor
      // ejemplo: ConstantesFlowPage.goPaginaTutorHome();
      return ConstantesFlowPage.GO_PAGINA_TUTOR_HOME;
    }
    return null;
  }

}
