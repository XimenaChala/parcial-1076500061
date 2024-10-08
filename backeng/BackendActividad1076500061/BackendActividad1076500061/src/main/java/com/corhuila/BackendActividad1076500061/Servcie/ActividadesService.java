package com.corhuila.BackendActividad1076500061.Servcie;

import com.corhuila.BackendActividad1076500061.Entitity.Actividades;
import com.corhuila.BackendActividad1076500061.IRepository.IActividadesRepository;
import com.corhuila.BackendActividad1076500061.IRepository.IBaseRepository;
import com.corhuila.BackendActividad1076500061.IService.IActividadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadesService extends ABaseService<Actividades> implements IActividadesService {
    @Override
    protected IBaseRepository<Actividades, Long> getRepository() {
        return repository;
    }
    @Autowired
    private IActividadesRepository repository;
}