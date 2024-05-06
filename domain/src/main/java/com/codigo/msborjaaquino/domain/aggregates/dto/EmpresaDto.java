package com.codigo.msborjaaquino.domain.aggregates.dto;

import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.Text;

import java.sql.Timestamp;

@Getter
@Setter
public class EmpresaDto {
    private Long idEmpresa;
    private String razonSocial;
    private String tipoDocumento;
    private String numeroDocumento;
    private Integer estado;
    private String condicion;
    //Los text son en BD, de cara a java seran string
    private String direccion;
    private String distrito;
    private String provincia;
    private String departamento;
    private boolean EsAgenteRetencion;
    private String usuaCrea;
    private Timestamp dateCreate;
    private String usuaModif;
    private Timestamp dateModif;
    private String usuaDelet;
    private Timestamp dateDelet;
}
