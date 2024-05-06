package com.codigo.msborjaaquino.infraestructure.dao;

import com.codigo.msborjaaquino.infraestructure.entity.EmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<EmpresaEntity , Long> {

}
