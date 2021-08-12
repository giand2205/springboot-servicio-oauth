package com.springboot.app.oauth.services;

import com.springboot.app.commons.usuarios.models.entity.Usuario;

public interface IUsuarioService {

    Usuario findByUsername(String username);

}
