package com.codigo.msborjaaquino.domain.ports.out;

import com.codigo.msborjaaquino.domain.aggregates.dto.PersonaDto;
import com.codigo.msborjaaquino.domain.aggregates.request.PersonaRequest;

import java.util.List;
import java.util.Optional;

public interface PersonaServiceOut {
    PersonaDto crearPersonaOut(PersonaRequest personaRequest);
    Optional<PersonaDto> buscarXIdOut(Long id);
    List<PersonaDto> obtenerTodosOut();
    PersonaDto actualizarOut(Long id, PersonaRequest personaRequest);
    PersonaDto deleteOut(Long id);
}
