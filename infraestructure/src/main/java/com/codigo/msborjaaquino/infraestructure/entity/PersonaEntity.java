package com.codigo.msborjaaquino.infraestructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.Text;

import java.sql.Timestamp;

@Entity
@Table(name = "persona")
@Getter
@Setter
public class PersonaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Persona")
    private Long idPersona;

    @Column(name = "nombre", nullable = false, length = 255)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 255)
    private String apellido;

    @Column(name = "tipodocumento", nullable = false, length = 5)
    private String tipodoc;

    @Column(name = "numerodocumento", nullable = false, length = 20)
    private String numDoc;

    @Column(name = "email", nullable = false, length = 255)
    private String email;

    @Column(name = "telefono", nullable = false, length = 255)
    private String telefono;

    @Column(name = "direccion", nullable = false, length = 255)
    private String direccion;

    @Column(name = "estado", nullable = false)
    private Integer estado;

    @Column(name = "usuacrea", length = 254)
    private String usuaCrea;

    @Column(name = "datecreate")
    private Timestamp dateCreate;

    @Column(name = "usuamodif", length = 254)
    private String usuaModif;

    @Column(name = "datemodif")
    private Timestamp dateModif;

    @Column(name = "usuadelet", length = 254)
    private String usuaDelet;

    @Column(name = "datedelet")
    private Timestamp dateDelet;

     @Column(name="empresa_id")
    private Integer empresa_id;

    //id empresa
    @ManyToOne
    @JoinColumn(name="id")
    private EmpresaEntity empresa;
}
