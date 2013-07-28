package com.pirux.tesis.dao.impl;

import java.util.List;

import org.hibernate.Criteria;

import com.pirux.tesis.dao.TallerVirtualDAO;
import com.pirux.tesis.model.TallerVirtual;

/**
 * Implementacion de la interfaz para el acceso
 * a los datos de un taller virtual
 * @author Landayer
 */
public class TallerVirtualDAOImpl extends GenericDAOImpl<TallerVirtual, Integer> implements TallerVirtualDAO{

  @SuppressWarnings("unchecked")
  @Override
  public List<TallerVirtual> buscarTalleresVirtuales() {
    final Criteria criteria = sessionFactory.getCurrentSession().createCriteria(TallerVirtual.class);
    final List<TallerVirtual> listaTalleresVirtuales = (List<TallerVirtual>) criteria.list();
    return listaTalleresVirtuales;
  }

  @Override
  public void grabarTallerVirtual(TallerVirtual tallerVirtual) {
    try {
      saveOrUpdate(tallerVirtual);
    } catch (Exception e) {
      // TODO dcabanillas manejar log4j
      System.out.println("Error al grabar TallerVirtual: "+tallerVirtual.toString());
    }
  }
}
