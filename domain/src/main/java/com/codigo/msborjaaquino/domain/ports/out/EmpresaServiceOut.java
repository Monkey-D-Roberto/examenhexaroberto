package com.codigo.msborjaaquino.domain.ports.out;

import com.codigo.msborjaaquino.domain.aggregates.dto.EmpresaDto;
import com.codigo.msborjaaquino.domain.aggregates.request.EmpresaRequest;

import java.util.List;
import java.util.Optional;

public interface EmpresaServiceOut {
    EmpresaDto crearEmpresaOut(EmpresaRequest empresaRequest);
    Optional<EmpresaDto> buscarXIdOut(Long id);
    List<EmpresaDto> obtenerTodosOut();
    EmpresaDto actualizarOut(Long id, EmpresaRequest empresaRequest);
    EmpresaDto deleteOut(Long id);
}
