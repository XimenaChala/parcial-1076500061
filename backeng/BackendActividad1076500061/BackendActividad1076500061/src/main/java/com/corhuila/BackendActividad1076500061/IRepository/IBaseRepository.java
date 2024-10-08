package com.corhuila.BackendActividad1076500061.IRepository;

import com.corhuila.BackendActividad1076500061.Entitity.ABaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBaseRepository<T extends ABaseEntity, ID> extends JpaRepository<T,Long> {
}