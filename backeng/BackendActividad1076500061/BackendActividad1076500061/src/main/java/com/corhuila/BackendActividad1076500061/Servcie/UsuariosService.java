package com.corhuila.BackendActividad1076500061.Servcie;

import com.corhuila.BackendActividad1076500061.Entitity.Usuarios;
import com.corhuila.BackendActividad1076500061.IRepository.IBaseRepository;
import com.corhuila.BackendActividad1076500061.IRepository.IUsuariosRepository;
import com.corhuila.BackendActividad1076500061.IService.IUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService extends ABaseService<Usuarios> implements IUsuariosService {
    @Override
    protected IBaseRepository<Usuarios, Long> getRepository() {
        return repository;
    }
    @Autowired
    private IUsuariosRepository repository;
}