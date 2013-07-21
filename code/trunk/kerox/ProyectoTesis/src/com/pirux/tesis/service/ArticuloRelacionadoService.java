package com.pirux.tesis.service;

import com.pirux.tesis.service.request.ArticuloRelacionadoRequest;
import com.pirux.tesis.service.response.ArticuloRelacionadoResponse;

/**
 * Interfaz para consultar la lista de articulos relacionados que se mostraran
 * al usuario
 */
public interface ArticuloRelacionadoService {

  /**
   * Metodo que traera la lista de articulos relacionados
   */
  ArticuloRelacionadoResponse consultarArticulosRelacionados(ArticuloRelacionadoRequest request);
}
