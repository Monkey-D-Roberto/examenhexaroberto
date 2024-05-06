package com.codigo.msborjaaquino.infraestructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "empresa_info")
@Getter
@Setter
public class EmpresaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idEmpresa;

    @Column(name = "razonsocial", nullable = false, length = 255)
    private String razonSocial;

    @Column(name = "tipodocumento", nullable = false, length = 255)
    private String tipoDocumento;

    @Column(name = "numerodocumento",unique = true, nullable = false, length = 20)
    private String numeroDocumento;

    @Column(name = "estado", nullable = false)
    private Integer estado;

    @Column(name = "condicion", nullable = false, length = 255)
    private String condicion;

    @Column(name = "direccion", nullable = false, length = 255)
    private String direccion;

    @Column(name = "distrito", nullable = false, length = 255)
    private String distrito;

    @Column(name = "provincia", nullable = false, length = 255)
    private String provincia;

    @Column(name = "departamento", nullable = false, length = 255)
    private String departamento;

    @Column(name = "esagenteretencion" ,nullable = false, unique = false)
    private boolean EsAgenteRetencion;

    @Column(name = "usua_crea", length = 254)
    private String usuaCrea;

    @Column(name = "date_create")
    private Timestamp dateCreate;

    @Column(name = "usua_modif", length = 254)
    private String usuaModif;

    @Column(name = "date_modif")
    private Timestamp dateModif;

    @Column(name = "usua_delet", length = 254)
    private String usuaDelet;

    @Column(name = "date_delet")
    private Timestamp dateDelet;
}
