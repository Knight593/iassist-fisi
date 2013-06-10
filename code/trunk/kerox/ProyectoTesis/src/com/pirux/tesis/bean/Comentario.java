package com.pirux.tesis.bean;

import java.util.Date;

public class Comentario {
  private String tipoAutor;
  private String autor;
  private String mensaje;
  private Date Hora;

  public String getAutor() {
    return autor;
  }

  public Comentario(final String autor, final String mensaje,
      final String tipoAutor) {
    this.autor = autor;
    this.mensaje = mensaje;
    this.tipoAutor = tipoAutor;
  }

  public void setAutor(final String autor) {
    this.autor = autor;
  }

  public String getMensaje() {
    return mensaje;
  }

  public void setMensaje(final String mensaje) {
    this.mensaje = mensaje;
  }

  public Date getHora() {
    return Hora;
  }

  public void setHora(final Date Hora) {
    this.Hora = Hora;
  }

  public String getTipoAutor() {
    return tipoAutor;
  }

  public void setTipoAutor(final String tipoAutor) {
    this.tipoAutor = tipoAutor;
  }

}
