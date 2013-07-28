package com.pirux.tesis.model;

import java.util.Date;

/**
 * Entidad que envolvera los datos de un hangout grabado
 * 
 * @author Landayer
 */
public class TallerVirtual {

  private Integer id;
  private String rutaLinkYouTube;
  private String rutaLinkEmbebido;
  private String titulo;
  private String nivel;
  private String tecnologias;
  private String descripcion;
  private String nombreTutor;
  private Date fecha;

  public Integer getId() {
    return id;
  }

  public void setId(final Integer id) {
    this.id = id;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(final Date fecha) {
    this.fecha = fecha;
  }

  public String getNombreTutor() {
    return nombreTutor;
  }

  public void setNombreTutor(final String nombreTutor) {
    this.nombreTutor = nombreTutor;
  }

  public String getRutaLinkYouTube() {
    return rutaLinkYouTube;
  }

  public void setRutaLinkYouTube(final String rutaLinkYouTube) {
    this.rutaLinkYouTube = rutaLinkYouTube;
  }

  public String getRutaLinkEmbebido() {
    return rutaLinkEmbebido;
  }

  public void setRutaLinkEmbebido(final String rutaLinkEmbebido) {
    this.rutaLinkEmbebido = rutaLinkEmbebido;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(final String titulo) {
    this.titulo = titulo;
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

}
