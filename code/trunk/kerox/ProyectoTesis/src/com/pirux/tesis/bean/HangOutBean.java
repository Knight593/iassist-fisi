package com.pirux.tesis.bean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.component.media.Media;
import org.primefaces.push.PushContext;
import org.primefaces.push.PushContextFactory;

/**
 * Bean para controlar el video del hangout
 */
@ManagedBean
@ApplicationScoped
public class HangOutBean {

  // Detalles de la sesion
  private String titulo;
  private String nivel;
  private String tecnologias;
  private String descripcion;
  // Detalles del tutor
  private String rutaImagen;
  private String nombreTutor;
  private String cargoTutor;
  private String interesesTutor;
  // Detalles del video
  private String rutaHangOut;
  private String ruta = "//resources//images//screen.png";
  private Media usuarioVideo;

  public HangOutBean() {
    if (ruta != null) {
      usuarioVideo = new Media();
      usuarioVideo.setValue(ruta);
      usuarioVideo.setRendered(true);
    }
  }

  public String getRuta() {
    return ruta;
  }

  public void setRuta(final String ruta) {
    this.ruta = ruta;
  }

  public Media getUsuarioVideo() {
    return usuarioVideo;
  }

  public void setUsuarioVideo(final Media usuarioVideo) {
    this.usuarioVideo = usuarioVideo;
  }

  public String getNivel() {
    return nivel;
  }

  public void setNivel(final String nivel) {
    this.nivel = nivel;
  }

  public String getTecnologias() {
    return tecnologias;
  }

  public void setTecnologias(final String tecnologias) {
    this.tecnologias = tecnologias;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(final String descripcion) {
    this.descripcion = descripcion;
  }

  public boolean isExisteHangOut() {
    if (ruta != null && !ruta.equals("")) {
      return true;
    }
    return false;
  }

  public String getRutaImagen() {
    return rutaImagen;
  }

  public void setRutaImagen(final String rutaImagen) {
    this.rutaImagen = rutaImagen;
  }

  public String getNombreTutor() {
    return nombreTutor;
  }

  public void setNombreTutor(final String nombreTutor) {
    this.nombreTutor = nombreTutor;
  }

  public String getCargoTutor() {
    return cargoTutor;
  }

  public void setCargoTutor(final String cargoTutor) {
    this.cargoTutor = cargoTutor;
  }

  public String getInteresesTutor() {
    return interesesTutor;
  }

  public void setInteresesTutor(final String interesesTutor) {
    this.interesesTutor = interesesTutor;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(final String titulo) {
    this.titulo = titulo;
  }

  public String getRutaHangOut() {
    return rutaHangOut;
  }

  public void setRutaHangOut(final String rutaHangOut) {
    this.rutaHangOut = rutaHangOut;
  }

  public synchronized void actualizarVideo() {
    final String datos = formarComponenteHtmlDelVideo();

    final FacesContext context = FacesContext.getCurrentInstance();
    final TutorSesionBean tutorBean = context.getApplication().evaluateExpressionGet(context,
        "#{tutorSesionBean}", TutorSesionBean.class);
    nombreTutor = tutorBean.getNombre();
    cargoTutor = tutorBean.getCargo();
    interesesTutor = tutorBean.getInteres();
    rutaImagen = tutorBean.getRutaImagen();
    if (usuarioVideo != null) {
      usuarioVideo.setRendered(false);
    }
    final PushContext pushContext = PushContextFactory.getDefault().getPushContext();
    pushContext.push("/videoCanal", datos);
  }

  private String formarComponenteHtmlDelVideo() {
    return "<iframe width='780' height='439' frameborder='0' allowfullscreen='1'  src='" + ruta
        + "'></iframe>";
  }
}
