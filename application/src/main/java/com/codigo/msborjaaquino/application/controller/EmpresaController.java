package com.codigo.msborjaaquino.application.controller;

import com.codigo.msborjaaquino.domain.aggregates.dto.EmpresaDto;
import com.codigo.msborjaaquino.domain.aggregates.dto.PersonaDto;
import com.codigo.msborjaaquino.domain.aggregates.request.EmpresaRequest;
import com.codigo.msborjaaquino.domain.aggregates.request.PersonaRequest;
import com.codigo.msborjaaquino.domain.ports.in.EmpresaServiceIn;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ms-borja-aquino/v1/empresa")
@AllArgsConstructor
public class EmpresaController {
    private final EmpresaServiceIn empresaServiceIn;

    @PostMapping
    public ResponseEntity<EmpresaDto> registrar(@RequestBody EmpresaRequest empresaRequest){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(empresaServiceIn.crearEmpresaIn(empresaRequest));
    }
    @GetMapping("/{id}")
    public ResponseEntity<EmpresaDto> bsucarXid(@PathVariable Long id){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(empresaServiceIn.buscarXIdIn(id).get());
    }

    @GetMapping("/todos")
    public ResponseEntity<List<EmpresaDto>> buscartodos(){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(empresaServiceIn.obtenerTodosIn());
    }
    @PutMapping("/{id}")
    public ResponseEntity<EmpresaDto> actualizar(@PathVariable Long id, @RequestBody EmpresaRequest empresaRequest){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(empresaServiceIn.actualizarIn(id,empresaRequest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<EmpresaDto> delete(@PathVariable Long id){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(empresaServiceIn.deleteIn(id));
    }
}
