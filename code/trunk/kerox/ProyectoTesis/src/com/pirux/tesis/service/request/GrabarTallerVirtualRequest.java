package com.pirux.tesis.service.request;

import com.pirux.tesis.model.TallerVirtual;

/**
 * Request para el servicio que grabara en base de datos, la data del taller
 * virtual (hangout)
 * 
 * @author Landayer
 */
public class GrabarTallerVirtualRequest {

  private TallerVirtual tallerVirtual;

  public TallerVirtual getTallerVirtual() {
    return tallerVirtual;
  }

  public void setTallerVirtual(final TallerVirtual tallerVirtual) {
    this.tallerVirtual = tallerVirtual;
  }

}
