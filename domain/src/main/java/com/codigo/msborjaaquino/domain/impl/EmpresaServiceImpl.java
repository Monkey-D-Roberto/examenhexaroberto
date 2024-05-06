package com.codigo.msborjaaquino.domain.impl;

import com.codigo.msborjaaquino.domain.aggregates.dto.EmpresaDto;
import com.codigo.msborjaaquino.domain.aggregates.request.EmpresaRequest;
import com.codigo.msborjaaquino.domain.ports.in.EmpresaServiceIn;
import com.codigo.msborjaaquino.domain.ports.out.EmpresaServiceOut;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor

public class EmpresaServiceImpl implements EmpresaServiceIn {

    private final EmpresaServiceOut empresaServiceOut;
    @Override
    public EmpresaDto crearEmpresaIn(EmpresaRequest empresaRequest) {
        return empresaServiceOut.crearEmpresaOut(empresaRequest);
    }

    @Override
    public Optional<EmpresaDto> buscarXIdIn(Long id) {
        return empresaServiceOut.buscarXIdOut(id);
    }

    @Override
    public List<EmpresaDto> obtenerTodosIn() {
        return empresaServiceOut.obtenerTodosOut();
    }

    @Override
    public EmpresaDto actualizarIn(Long id, EmpresaRequest empresaRequest) {
        return empresaServiceOut.actualizarOut(id,empresaRequest);
    }

    @Override
    public EmpresaDto deleteIn(Long id) {
        return empresaServiceOut.deleteOut(id);
    }
}
