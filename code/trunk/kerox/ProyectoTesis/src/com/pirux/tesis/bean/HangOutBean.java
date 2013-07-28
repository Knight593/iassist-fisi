package com.pirux.tesis.bean;

import java.util.Date;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.component.media.Media;
import org.primefaces.push.PushContext;
import org.primefaces.push.PushContextFactory;

import com.pirux.tesis.handler.TallerVirtualHandler;
import com.pirux.tesis.model.TallerVirtual;

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
  // TODO dcabanillas, mover a un ConstantesRecursos
  private String ruta = "//resources//images//kerox_completo.png";
  private Media usuarioVideo;

  //Handlers
  private TallerVirtualHandler tallerVirtualHandler;

  public HangOutBean(final TallerVirtualHandler tallerVirtualHandler) {
    this.tallerVirtualHandler = tallerVirtualHandler;
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
    if (rutaHangOut != null && !rutaHangOut.equals("")) {
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
    // TODO dcabanillas, la accionde grabar deberia ser un hilo
    grabarHangOut();
  }

  private void grabarHangOut() {
    final TallerVirtual taller = new TallerVirtual();
    taller.setDescripcion(descripcion);
    taller.setFecha(new Date());
    taller.setNivel(nivel);
    taller.setNombreTutor(nombreTutor);
    taller.setRutaLinkEmbebido("https://youtube.googleapis.com/v/R7hontvjr1E");
    taller.setRutaLinkYouTube("http://www.youtube.com/watch?v=Q1SwrYMD2BI");
    taller.setTecnologias(tecnologias);
    taller.setTitulo(titulo);
    // TODO dcabanillas: evitar el set, mandar el taller como parametro
    tallerVirtualHandler.setTallerVirtual(taller);
    tallerVirtualHandler.grabarTallerVirtual();
  }

  private String formarComponenteHtmlDelVideo() {
    // TODO dcabanillas probar con 640x390
    return "<iframe width='900' height='550' frameborder='0' allowfullscreen='1'  src='" + ruta
        + "'></iframe>";
  }
}
