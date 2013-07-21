package com.pirux.tesis.bean;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.primefaces.push.PushContext;
import org.primefaces.push.PushContextFactory;

import com.pirux.tesis.handler.ArticuloRelacionadoHandler;
import com.pirux.tesis.model.ArticuloRealcionado;
import com.pirux.tesis.service.response.ArticuloRelacionadoResponse;

@ManagedBean
@ApplicationScoped
// Evaluar de que sea session scope
// Esta informacion quedara registrada a nivel de BD
public class ArticulosRelacionadosBean {

  private List<ArticuloRealcionado> articulosRelacionados;

  // datos para agregar articulo
  private String urlAgregar;
  private String tituloAgregar;
  private String imagenAgregar;

  // Handler
  private final ArticuloRelacionadoHandler articuloRelacionadoHandler;

  public ArticulosRelacionadosBean(final ArticuloRelacionadoHandler articuloRelacionadoHandler) {
    this.articuloRelacionadoHandler = articuloRelacionadoHandler;
    // TODO dcabanillas: Averiguar si no es malo llamar a BE en constructor
    articulosRelacionados = obtenerArticulosRelacionados();
  }

  public String getUrlAgregar() {
    return urlAgregar;
  }

  public void setUrlAgregar(final String urlAgregar) {
    this.urlAgregar = urlAgregar;
  }

  public String getTituloAgregar() {
    return tituloAgregar;
  }

  public void setTituloAgregar(final String tituloAgregar) {
    this.tituloAgregar = tituloAgregar;
  }

  public String getImagenAgregar() {
    return imagenAgregar;
  }

  public void setImagenAgregar(final String imagenAgregar) {
    this.imagenAgregar = imagenAgregar;
  }

  public synchronized void agregarArticuloRelacionado() {
    final ArticuloRealcionado articulo = new ArticuloRealcionado();
    articulo.setTituloPost(tituloAgregar);
    articulo.setUrlPost(urlAgregar);
    articulo.setRutaImagen(imagenAgregar);
    articulosRelacionados.add(0, articulo);
    final PushContext pushContext = PushContextFactory.getDefault().getPushContext();
    pushContext.push("/LinkRelacionadoCanal", null);
    tituloAgregar = "";
    imagenAgregar = "";
    urlAgregar = "";
  }

  private List<ArticuloRealcionado> obtenerArticulosRelacionados() {
    // TODO dcabanillas, se deja este atributo en caso el numero de articulos
    // sea variable.
    // articuloRelacionadoHandler.setCantidadArticulosPorDefecto(cantidad)
    final ArticuloRelacionadoResponse response = articuloRelacionadoHandler
        .obtenerArticulosRelacionados();
    final List<ArticuloRealcionado> listaArticulosRelacionados = response
        .getListaArticulosRelacionados();
    return listaArticulosRelacionados;
  }

  public List<ArticuloRealcionado> getArticulosRelacionados() {
    return articulosRelacionados;
  }

  public void setArticulosRelacionados(final List<ArticuloRealcionado> articulosRelacionados) {
    this.articulosRelacionados = articulosRelacionados;
  }

}
