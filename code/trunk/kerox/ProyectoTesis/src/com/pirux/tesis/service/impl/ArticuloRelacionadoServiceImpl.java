package com.pirux.tesis.service.impl;

import com.pirux.tesis.service.ArticuloRelacionadoService;
import com.pirux.tesis.service.request.ArticuloRelacionadoRequest;
import com.pirux.tesis.service.response.ArticuloRelacionadoResponse;

/**
 * Implementacion del servicio que consultara
 * la data del articulo relacionado de base de datos
 * para ser mostrada al usuario
 * @author Landayer
 */
public class ArticuloRelacionadoServiceImpl implements ArticuloRelacionadoService {

  @Override
  public ArticuloRelacionadoResponse consultarArticulosRelacionados(
      ArticuloRelacionadoRequest request) {
    // TODO dcabanillas hacer la llamada a BD
    return null;
  }
}
