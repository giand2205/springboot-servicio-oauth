package com.springboot.app.oauth.services;

import com.springboot.app.commons.usuarios.models.entity.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface IUsuarioService {

    Usuario findByUsername(String username);

    Usuario update(Usuario usuario, Long id);

}
