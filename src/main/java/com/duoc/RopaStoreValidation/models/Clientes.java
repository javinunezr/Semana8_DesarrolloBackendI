package com.duoc.RopaStoreValidation.models;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Esta notacion incluye metodos: Setters, Getters & toString
@AllArgsConstructor // Indicamos que la clase tendra unc ontructor con todos los parametros
@NoArgsConstructor // Indicamos que la clase tendra un constructor sin parametros

@Entity
@Table(name = "Clientes")
public class Clientes {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profile_info_seq_clientes")
    @SequenceGenerator(name="profile_info_seq_clientes",sequenceName = "profile_info_seq_clientes",allocationSize = 1,initialValue = 1000)
    private Long idCliente;

    @Column(name = "rutCliente", nullable = false, unique = true) // Obligatorio y único
    private String rutCliente;

    @Column(name = "nombreCliente", nullable = false) // Obligatorio
    private String nombreCliente;

    @Column(name = "correoCliente", nullable = false) // Obligatorio
    private String correoCliente;

    @Column(name = "telefonoCliente", nullable = false) // Obligatorio
    private int telefonoCliente;

    @Column(name = "direccionCliente", nullable = false) // Obligatorio
    private String direccionCliente;
}
