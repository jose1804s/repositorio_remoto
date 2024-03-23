package com.impactovisual.apirest.Registro;

import jakarta.annotation.Generated;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class persona {
    @Id
    @GeneratedValue
    private Integer id;
    @Basic
    private String nombre; 
    private String apellido;
    private String Documento_identidad;
    private String correo;
    private String telefono;
    private String direccion;
    private String contrasehna;
    private String rol;
}
