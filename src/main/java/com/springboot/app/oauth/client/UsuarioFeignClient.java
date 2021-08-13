package com.springboot.app.oauth.client;

import com.springboot.app.commons.usuarios.models.entity.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="servicio-usuarios")
public interface UsuarioFeignClient {

    @GetMapping("/usuarios/search/buscar-username")
    Usuario findByUsername(@RequestParam String nombre);

    @PutMapping("usuarios/{id}")
    Usuario update(@RequestBody Usuario usuario, @PathVariable Long id);

}
