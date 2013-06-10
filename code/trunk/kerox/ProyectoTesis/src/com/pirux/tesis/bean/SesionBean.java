package com.pirux.tesis.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SesionBean {

  /**
   * Creates a new instance of SesionBean
   */
  private List<Comentario> comentarios;
  private String nuevoMensaje;
  private String autor;

  public SesionBean() {
    comentarios = new ArrayList<Comentario>();
    cargarDataEjemplo();
  }

  public void cargarDataEjemplo() {
    comentarios.add(new Comentario("Juan Carlos Sanchez",
        "Interesante tema...", "usuario"));
    comentarios.add(new Comentario("Erik Chavez",
        "no se causa.. yo estoy volando ¬¬", "usuario"));
    comentarios.add(new Comentario("David Cabanillas", "oh piru why!!!",
        "usuario"));
    nuevoMensaje = "";
    autor = "";
  }

  public void agregarComentario() {
    comentarios.add(new Comentario(autor + " (Invitado)", nuevoMensaje,
        "invitado"));

    for (int i = comentarios.size() - 2; i >= 0; i--) {
      comentarios.set(i + 1, new Comentario(comentarios.get(i).getAutor(),
          comentarios.get(i).getMensaje(), comentarios.get(i).getTipoAutor()));
    }
    comentarios.set(0, new Comentario(autor + " (Invitado)", nuevoMensaje,
        "invitado"));
    nuevoMensaje = "";
    autor = "";
  }

  public List<Comentario> getComentarios() {
    return comentarios;
  }

  public void setComentarios(final List<Comentario> comentarios) {
    this.comentarios = comentarios;
  }

  public String getNuevoMensaje() {
    return nuevoMensaje;
  }

  public void setNuevoMensaje(final String nuevoMensaje) {
    this.nuevoMensaje = nuevoMensaje;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(final String autor) {
    this.autor = autor;
  }

}
