package com.pirux.tesis.dao;

import com.pirux.tesis.model.Usuario;

/**
 * Interface para acceder al logueo del tutor
 */
public interface UsuarioDAO {

	Usuario buscarUsuario(String usuario, String password);
}
