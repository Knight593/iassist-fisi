package com.pirux.tesis.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.pirux.tesis.dao.UsuarioDAO;
import com.pirux.tesis.model.Usuario;

/**
 * Implementacion del acceso a datos del tutor
 */
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario, Integer>
    implements UsuarioDAO {

  @Override
  public Usuario buscarUsuario(String usuario, String password) {
    final Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Usuario.class);
    criteria.add(Restrictions.eq("usuario", usuario));
    criteria.add(Restrictions.eq("password", password));
    return (Usuario) criteria.uniqueResult();
  }

}
