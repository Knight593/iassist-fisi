package com.pirux.tesis.dao;

import com.pirux.tesis.model.Tutor;

/**
 * Interface para acceder al logueo del tutor
 */
public interface TutorDAO extends GenericDAO<Tutor, Integer>{

	Tutor buscarUsuario(String usuario, String password);
}
