package com.codigo.msborjaaquino.domain.aggregates.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpresaRequest {
    private Integer tipoDoc;
    private String numDoc;
}
