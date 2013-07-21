package com.pirux.tesis.service.request;

/**
 * Request para el servicio que consulta la lista de articulos relacionados,
 * para mostrar al usuario
 */
public class ArticuloRelacionadoRequest {

  private int cantidadArticulos;

  public int getCantidadArticulos() {
    return cantidadArticulos;
  }

  public void setCantidadArticulos(final int cantidadArticulos) {
    this.cantidadArticulos = cantidadArticulos;
  }
}
