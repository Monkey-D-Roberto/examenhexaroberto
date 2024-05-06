package com.codigo.msborjaaquino.infraestructure.dao;

import com.codigo.msborjaaquino.infraestructure.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository  extends JpaRepository<PersonaEntity, Long> {

}
