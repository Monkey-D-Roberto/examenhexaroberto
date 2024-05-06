package com.codigo.msborjaaquino.domain.ports.in;

import com.codigo.msborjaaquino.domain.aggregates.dto.PersonaDto;
import com.codigo.msborjaaquino.domain.aggregates.request.PersonaRequest;

import java.util.List;
import java.util.Optional;

public interface PersonaServiceIn {
    PersonaDto crearPersonaIn(PersonaRequest personaRequest);
    Optional<PersonaDto> buscarXIdIn(Long id);
    List<PersonaDto> obtenerTodosIn();
    PersonaDto actualizarIn(Long id, PersonaRequest personaRequest);
    PersonaDto deleteIn(Long id);
}
