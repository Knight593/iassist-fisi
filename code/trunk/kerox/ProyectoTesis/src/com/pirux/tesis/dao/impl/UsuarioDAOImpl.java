package com.pirux.tesis.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.pirux.tesis.dao.UsuarioDAO;
import com.pirux.tesis.model.Usuario;
import com.pirux.tesis.persistence.AbstractHibernateDAO;

/**
 * Implementacion del acceso a datos del tutor
 */
public class UsuarioDAOImpl extends AbstractHibernateDAO implements UsuarioDAO {

  // TODO dcabanillas: Subir este session factory a nivel del
  // AbstractHibernateDAO
  public SessionFactory localSessionFactory;

  @Override
  public Usuario buscarUsuario(final String usuario, final String password) {
    // TODO dcabanillas: ver si conviene usar "getSession" o "openSession"
    final Criteria criteria = localSessionFactory.openSession().createCriteria(Usuario.class);
    criteria.add(Restrictions.eq("usuario", usuario));
    criteria.add(Restrictions.eq("password", password));
    // localSessionFactory.close();
    return (Usuario) criteria.uniqueResult();
  }

  public void setLocalSessionFactory(final SessionFactory localSessionFactory) {
    this.localSessionFactory = localSessionFactory;
  }

}
