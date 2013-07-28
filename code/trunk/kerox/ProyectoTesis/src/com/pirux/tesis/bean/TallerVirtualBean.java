package com.pirux.tesis.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.pirux.tesis.handler.TallerVirtualHandler;
import com.pirux.tesis.model.TallerVirtual;
import com.pirux.tesis.service.response.TallerVirtualResponse;

/**
 * Representa un Hangout Grabado
 * 
 * @author Landayer
 */
@ManagedBean
@SessionScoped
public class TallerVirtualBean {

  private List<TallerVirtual> talleresVirtuales;
  private TallerVirtualHandler tallerVirtualHandler;

  public TallerVirtualBean(final TallerVirtualHandler tallerVirtualHandler) {
    this.tallerVirtualHandler = tallerVirtualHandler;
    talleresVirtuales = obtenerTalleresVirtuales();
  }

  private List<TallerVirtual> obtenerTalleresVirtuales() {
    final TallerVirtualResponse response = tallerVirtualHandler.consultarTalleresVirtuales();
    return response.getListaTalleresVirtuales();
  }
  
  public List<TallerVirtual> getTalleresVirtuales() {
    return talleresVirtuales;
  }

  public void setTalleresVirtuales(final List<TallerVirtual> talleresVirtuales) {
    this.talleresVirtuales = talleresVirtuales;
  }

}
