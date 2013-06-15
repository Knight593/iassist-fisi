package com.pirux.tesis.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.push.PushContext;
import org.primefaces.push.PushContextFactory;

import com.pirux.tesis.model.ArticuloRealcionado;

@ManagedBean
@ApplicationScoped
public class ArticulosRelacionadosBean {

  private List<ArticuloRealcionado> articulosRelacionados;

  // datos para agregar articulo
  private String urlAgregar;
  private String tituloAgregar;
  private String imagenAgregar;

  public String getUrlAgregar() {
    return urlAgregar;
  }

  public void setUrlAgregar(String urlAgregar) {
    this.urlAgregar = urlAgregar;
  }

  public String getTituloAgregar() {
    return tituloAgregar;
  }

  public void setTituloAgregar(String tituloAgregar) {
    this.tituloAgregar = tituloAgregar;
  }

  public String getImagenAgregar() {
    return imagenAgregar;
  }

  public void setImagenAgregar(String imagenAgregar) {
    this.imagenAgregar = imagenAgregar;
  }

  public ArticulosRelacionadosBean() {
    this.articulosRelacionados = obtenerArticulosRelacionados();
  }

  public synchronized void agregarArticuloRelacionado() {
    final ArticuloRealcionado articulo = new ArticuloRealcionado();
    articulo.setTituloPost(tituloAgregar);
    articulo.setUrlPost(urlAgregar);
    articulo.setRutaImagen(imagenAgregar);
    articulosRelacionados.add(0, articulo);
    final FacesContext facesContext = FacesContext.getCurrentInstance();
    final TutorSesionBean sesionTutor = facesContext.getApplication()
        .evaluateExpressionGet(facesContext, "#{tutorSesionBean}",
            TutorSesionBean.class);
    final PushContext pushContext = PushContextFactory.getDefault()
        .getPushContext();
    pushContext.push("/LinkRelacionado", null);
    this.tituloAgregar = "";
    this.imagenAgregar = "";
    this.urlAgregar = "";
  }

  private List<ArticuloRealcionado> obtenerArticulosRelacionados() {
    final List<ArticuloRealcionado> listaArticulosRelacionados = new ArrayList<ArticuloRealcionado>();

    final ArticuloRealcionado articulo = new ArticuloRealcionado();
    articulo.setTituloPost("Nueva Xbox one");
    articulo.setUrlPost("http://www.google.com.pe");
    articulo.setRutaImagen("/resources/images/kerox_logo.jpg");

    final ArticuloRealcionado articulo2 = new ArticuloRealcionado();
    articulo2.setTituloPost("PS4 esta disponible");
    articulo2.setUrlPost("http://www.google.com.pe");
    articulo2.setRutaImagen("/resources/images/kerox_logo.jpg");

    final ArticuloRealcionado articulo3 = new ArticuloRealcionado();
    articulo3.setTituloPost("Ultrabook libre facil");
    articulo3.setUrlPost("http://www.google.com.pe");
    articulo3.setRutaImagen("/resources/images/kerox_logo.jpg");

    final ArticuloRealcionado articulo4 = new ArticuloRealcionado();
    articulo4.setTituloPost("peru perdio :(");
    articulo4.setUrlPost("http://www.google.com.pe");
    articulo4.setRutaImagen("/resources/images/kerox_logo.jpg");

    listaArticulosRelacionados.add(articulo);
    listaArticulosRelacionados.add(articulo2);
    listaArticulosRelacionados.add(articulo3);
    listaArticulosRelacionados.add(articulo4);

    return listaArticulosRelacionados;
  }

  public List<ArticuloRealcionado> getArticulosRelacionados() {
    return articulosRelacionados;
  }

  public void setArticulosRelacionados(
      final List<ArticuloRealcionado> articulosRelacionados) {
    this.articulosRelacionados = articulosRelacionados;
  }

}
