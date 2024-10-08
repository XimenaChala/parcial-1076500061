package com.corhuila.BackendActividad1076500061.Controller;

import com.corhuila.BackendActividad1076500061.Entitity.Usuarios;
import com.corhuila.BackendActividad1076500061.IService.IUsuariosService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/usuarios")
public class UsuariosController extends ABaseController<Usuarios, IUsuariosService> {
    public UsuariosController(IUsuariosService service) {
        super(service, "Usuarios");
    }
}
