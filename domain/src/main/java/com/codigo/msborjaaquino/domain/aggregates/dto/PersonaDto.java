package com.codigo.msborjaaquino.domain.aggregates.dto;

import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.Text;

import java.sql.Timestamp;
@Getter
@Setter
public class PersonaDto {
    private Long idPersona;
    private String nombre;
    private String apellido;
    private String tipoDoc;
    private String numDoc;
    private String email;
    private String telefono;
    private String direccion;
    private Integer estado;
    private String usuaCrea;
    private Timestamp dateCreate;
    private String usuaModif;
    private Timestamp dateModif;
    private String usuaDelet;
    private Timestamp dateDelet;
}
