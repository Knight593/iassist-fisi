package com.pirux.tesis.service.impl;

import java.util.List;

import com.pirux.tesis.dao.TallerVirtualDAO;
import com.pirux.tesis.model.TallerVirtual;
import com.pirux.tesis.service.TallerVirtualService;
import com.pirux.tesis.service.request.GrabarTallerVirtualRequest;
import com.pirux.tesis.service.request.TallerVirtualRequest;
import com.pirux.tesis.service.response.GrabarTallerVirtualResponse;
import com.pirux.tesis.service.response.TallerVirtualResponse;

/**
 * Implementacion del servicio de consulta de talleres virtuales
 * 
 * @author Landayer
 */
public class TallerVirtualServiceImpl implements TallerVirtualService {

  private TallerVirtualDAO tallerVirtualDAO;

  @Override
  public TallerVirtualResponse consultarTalleresVirtuales(final TallerVirtualRequest request) {
    final TallerVirtualResponse response = new TallerVirtualResponse();
    final List<TallerVirtual> listaTalleresVirtuales = tallerVirtualDAO.buscarTalleresVirtuales();
    // Seteamos el campo Date desde DateSql
    for(final TallerVirtual taller : listaTalleresVirtuales) {
      taller.setFecha(taller.getFechaSql());
    }
    response.setListaTalleresVirtuales(listaTalleresVirtuales);
    return response;
  }

  @Override
  public GrabarTallerVirtualResponse grabarTallerVirtual(final GrabarTallerVirtualRequest request) {
    final GrabarTallerVirtualResponse response = new GrabarTallerVirtualResponse();
    tallerVirtualDAO.grabarTallerVirtual(request.getTallerVirtual());
    return response;
  }

  public void setTallerVirtualDAO(final TallerVirtualDAO tallerVirtualDAO) {
    this.tallerVirtualDAO = tallerVirtualDAO;
  }

}
