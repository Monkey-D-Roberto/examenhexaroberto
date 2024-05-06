package com.codigo.msborjaaquino.application.controller;

import com.codigo.msborjaaquino.domain.aggregates.dto.PersonaDto;
import com.codigo.msborjaaquino.domain.aggregates.request.PersonaRequest;
import com.codigo.msborjaaquino.domain.ports.in.PersonaServiceIn;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ms-borja-aquino/v1/persona")
@AllArgsConstructor
public class PersonaController {
    private final PersonaServiceIn personaServiceIn;

    @PostMapping
    public ResponseEntity<PersonaDto> registrar(@RequestBody PersonaRequest requestPersona){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(personaServiceIn.crearPersonaIn(requestPersona));
    }
    @GetMapping("/{id}")
    public ResponseEntity<PersonaDto> bsucarXid(@PathVariable Long id){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(personaServiceIn.buscarXIdIn(id).get());
    }

    @GetMapping("/todos")
    public ResponseEntity<List<PersonaDto>> buscartodos(){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(personaServiceIn.obtenerTodosIn());
    }
    @PutMapping("/{id}")
    public ResponseEntity<PersonaDto> actualizar(@PathVariable Long id, @RequestBody PersonaRequest personaRequest){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(personaServiceIn.actualizarIn(id,personaRequest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<PersonaDto> delete(@PathVariable Long id){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(personaServiceIn.deleteIn(id));
    }

}
