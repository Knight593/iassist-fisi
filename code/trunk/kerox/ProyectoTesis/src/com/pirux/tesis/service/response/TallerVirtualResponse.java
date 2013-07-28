package com.pirux.tesis.service.response;

import java.util.List;

import com.pirux.tesis.model.TallerVirtual;

/**
 * Se maneja la respuesta del servicio de consulta de talleres virtuales
 * 
 * @author Landayer
 */
public class TallerVirtualResponse {

  private List<TallerVirtual> listaTalleresVirtuales;

  public List<TallerVirtual> getListaTalleresVirtuales() {
    return listaTalleresVirtuales;
  }

  public void setListaTalleresVirtuales(final List<TallerVirtual> listaTalleresVirtuales) {
    this.listaTalleresVirtuales = listaTalleresVirtuales;
  }

}
