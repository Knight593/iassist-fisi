package com.pirux.tesis.handler;

import com.pirux.tesis.model.TallerVirtual;
import com.pirux.tesis.service.TallerVirtualService;
import com.pirux.tesis.service.request.GrabarTallerVirtualRequest;
import com.pirux.tesis.service.request.TallerVirtualRequest;
import com.pirux.tesis.service.response.GrabarTallerVirtualResponse;
import com.pirux.tesis.service.response.TallerVirtualResponse;

/**
 * Handler para manejar las consultas de talleres virtuales pasados, que se
 * mostrara al usuario
 * 
 * @author Landayer
 */
public class TallerVirtualHandler {

  private TallerVirtual tallerVirtual;

  private final TallerVirtualService tallerVirtualService;

  public TallerVirtualHandler(final TallerVirtualService tallerVirtualService) {
    this.tallerVirtualService = tallerVirtualService;
  }

  public TallerVirtualResponse consultarTalleresVirtuales() {
    try {
      final TallerVirtualRequest request = new TallerVirtualRequest();
      final TallerVirtualResponse response = tallerVirtualService
          .consultarTalleresVirtuales(request);
      return response;
    } catch (final Exception e) {
      return null;
    }
  }

  public GrabarTallerVirtualResponse grabarTallerVirtual() {
    try {
      final GrabarTallerVirtualRequest request = new GrabarTallerVirtualRequest();
      request.setTallerVirtual(tallerVirtual);
      final GrabarTallerVirtualResponse response = tallerVirtualService.grabarTallerVirtual(request);
      return response;
    } catch (final Exception e) {
      return null;
    }
  }

  public TallerVirtual getTallerVirtual() {
    return tallerVirtual;
  }

  public void setTallerVirtual(final TallerVirtual tallerVirtual) {
    this.tallerVirtual = tallerVirtual;
  }

}
