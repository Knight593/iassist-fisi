package com.pirux.tesis.service;

import com.pirux.tesis.service.request.GrabarTallerVirtualRequest;
import com.pirux.tesis.service.request.TallerVirtualRequest;
import com.pirux.tesis.service.response.GrabarTallerVirtualResponse;
import com.pirux.tesis.service.response.TallerVirtualResponse;

/**
 * Interfaz para el servicio de consulta de talleres virtuales
 * 
 * @author Landayer
 */
public interface TallerVirtualService {

  TallerVirtualResponse consultarTalleresVirtuales(TallerVirtualRequest request);
  
  GrabarTallerVirtualResponse grabarTallerVirtual(GrabarTallerVirtualRequest request);
}
