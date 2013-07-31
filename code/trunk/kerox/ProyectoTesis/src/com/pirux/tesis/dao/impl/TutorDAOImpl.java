package com.pirux.tesis.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.pirux.tesis.dao.TutorDAO;
import com.pirux.tesis.model.Tutor;

/**
 * Implementacion del acceso a datos del tutor
 */
public class TutorDAOImpl extends GenericDAOImpl<Tutor, Integer>
    implements TutorDAO {

  @Override
  public Tutor buscarUsuario(String usuario, String password) {
    // TODO dcabanillas: ver la forma de usar el getCurrentSession()
    final Criteria criteria = sessionFactory.openSession().createCriteria(Tutor.class);
    criteria.add(Restrictions.eq("usuario", usuario));
    criteria.add(Restrictions.eq("password", password));
    return (Tutor) criteria.uniqueResult();
  }

}
