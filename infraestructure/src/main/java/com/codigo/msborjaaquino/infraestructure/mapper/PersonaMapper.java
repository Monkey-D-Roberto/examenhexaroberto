package com.codigo.msborjaaquino.infraestructure.mapper;

import com.codigo.msborjaaquino.domain.aggregates.dto.PersonaDto;
import com.codigo.msborjaaquino.infraestructure.entity.PersonaEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonaMapper {
    public static PersonaDto fromEntity(PersonaEntity entity) {
        PersonaDto dto = new PersonaDto();
        dto.setIdPersona(entity.getIdPersona());
        dto.setNombre(entity.getNombre());
        dto.setApellido(entity.getApellido());
        dto.setTipoDoc(entity.getTipodoc());
        dto.setNumDoc(entity.getNumDoc());
        dto.setEmail(entity.getEmail());
        dto.setDireccion(entity.getDireccion());
        dto.setEstado(entity.getEstado());
        dto.setUsuaCrea(entity.getUsuaCrea());
        dto.setDateCreate(entity.getDateCreate());
        dto.setUsuaModif(entity.getUsuaModif());
        dto.setDateModif(entity.getDateModif());
        dto.setUsuaDelet(entity.getUsuaDelet());
        dto.setDateDelet(entity.getDateDelet());
        return dto;
    }
}
