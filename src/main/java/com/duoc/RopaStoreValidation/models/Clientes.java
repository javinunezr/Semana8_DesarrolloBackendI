package com.duoc.RopaStoreValidation.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
    @SequenceGenerator(name = "profile_info_seq_clientes", sequenceName = "profile_info_seq_clientes", allocationSize = 1, initialValue = 1000)
    private Long idCliente;

    @NotNull
    @Column(name = "rutCliente", nullable = false, unique = true) // Obligatorio y único
    @Size(min = 5, max = 15)
    private String rutCliente;

    @NotNull
    @Column(name = "nombreCliente", nullable = false) // Obligatorio
    @Size(min = 5, max = 15)
    private String nombreCliente;

    @NotNull
    @Column(name = "correoCliente", nullable = false) // Obligatorio
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")
    private String correoCliente;

    @NotNull
    @Column(name = "telefonoCliente", nullable = false) // Obligatorio
    @Min(1)
    private int telefonoCliente;

    @NotNull
    @Column(name = "direccionCliente", nullable = false) // Obligatorio
    @Size(min = 5, max = 50)
    private String direccionCliente;

    // Atributo para manejar la relacion entre un cliente y uno o muchos pedidos
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Pedidos> pedidos = new ArrayList<>();
}
