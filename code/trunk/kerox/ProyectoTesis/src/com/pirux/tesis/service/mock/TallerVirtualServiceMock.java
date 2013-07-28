package com.pirux.tesis.service.mock;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.pirux.tesis.model.TallerVirtual;
import com.pirux.tesis.service.TallerVirtualService;
import com.pirux.tesis.service.request.GrabarTallerVirtualRequest;
import com.pirux.tesis.service.request.TallerVirtualRequest;
import com.pirux.tesis.service.response.GrabarTallerVirtualResponse;
import com.pirux.tesis.service.response.TallerVirtualResponse;

/**
 * Servicio mock de la consulta de talleres virtuales
 * @author Landayer
 */
public class TallerVirtualServiceMock implements TallerVirtualService {

  @Override
  public TallerVirtualResponse consultarTalleresVirtuales(TallerVirtualRequest request) {
    final TallerVirtualResponse response = new TallerVirtualResponse();
    final List<TallerVirtual> talleresVirtuales = new ArrayList<>();
    for(int i = 0; i < 100; i++) {
      final TallerVirtual taller = new TallerVirtual();
      taller.setNombreTutor("David"+i);
      taller.setTitulo("Titulo "+i);
      taller.setFecha(new Date());
      taller.setTecnologias("JAVA "+i);
      taller.setDescripcion("Descripcion "+i);
      taller.setRutaLinkYouTube("http://www.youtube.com/");
      taller.setNivel("Avanzado "+i);
      talleresVirtuales.add(taller);
    }
    response.setListaTalleresVirtuales(talleresVirtuales);
    return response;
  }

  @Override
  public GrabarTallerVirtualResponse grabarTallerVirtual(GrabarTallerVirtualRequest request) {
    return new GrabarTallerVirtualResponse();
  }

}
