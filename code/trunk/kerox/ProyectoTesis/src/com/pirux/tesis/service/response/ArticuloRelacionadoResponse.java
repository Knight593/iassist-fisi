package com.pirux.tesis.service.response;

import java.util.List;

import com.pirux.tesis.model.ArticuloRealcionado;

/**
 * Response del servicio para traer la lista de articulos relacionados, para el
 * usuario
 */
public class ArticuloRelacionadoResponse {
  List<ArticuloRealcionado> listaArticulosRelacionados;

  public List<ArticuloRealcionado> getListaArticulosRelacionados() {
    return listaArticulosRelacionados;
  }

  public void setListaArticulosRelacionados(
      final List<ArticuloRealcionado> listaArticulosRelacionados) {
    this.listaArticulosRelacionados = listaArticulosRelacionados;
  }

}
