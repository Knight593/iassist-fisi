package com.pirux.tesis.dao;

import java.util.List;

import com.pirux.tesis.model.TallerVirtual;

/**
 * Interface para acceder a los datos de los
 * talleres virtuales en base de datos
 * @author Landayer
 */
public interface TallerVirtualDAO extends GenericDAO<TallerVirtual, Integer>{

  List<TallerVirtual> buscarTalleresVirtuales();
  
  void grabarTallerVirtual(TallerVirtual tallerVirtual);
}
