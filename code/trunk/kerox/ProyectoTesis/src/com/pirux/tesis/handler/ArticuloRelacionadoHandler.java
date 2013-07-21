package com.pirux.tesis.handler;

import com.pirux.tesis.service.ArticuloRelacionadoService;
import com.pirux.tesis.service.request.ArticuloRelacionadoRequest;
import com.pirux.tesis.service.response.ArticuloRelacionadoResponse;

/**
 * Maneja las llamadas a backend para los articulos relacionados
 * 
 * @author Landayer
 */
public class ArticuloRelacionadoHandler {

  private static final int CANTIDAD_ARTICULOS_POR_DEFECTO = 10;
  private ArticuloRelacionadoService articuloRelacionadoService;
  private int cantidadArticulosPorDefecto;

  public ArticuloRelacionadoHandler(final ArticuloRelacionadoService articuloRelacionadoService) {
    this.articuloRelacionadoService = articuloRelacionadoService;
  }
  
  public ArticuloRelacionadoResponse obtenerArticulosRelacionados() {
    try {
      final ArticuloRelacionadoRequest request = new ArticuloRelacionadoRequest();
      if (cantidadArticulosPorDefecto > 0) {
        request.setCantidadArticulos(cantidadArticulosPorDefecto);
      } else {
        request.setCantidadArticulos(CANTIDAD_ARTICULOS_POR_DEFECTO);
      }
      final ArticuloRelacionadoResponse response = articuloRelacionadoService
          .consultarArticulosRelacionados(request);
      return response;
    } catch (final Exception e) {
      return null;
    }
  }

  public void setCantidadArticulosPorDefecto(final int cantidadArticulosPorDefecto) {
    this.cantidadArticulosPorDefecto = cantidadArticulosPorDefecto;
  }

}
