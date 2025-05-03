package com.duoc.RopaStoreValidation.models;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Esta notacion incluye metodos: Setters, Getters & toString
@AllArgsConstructor // Indicamos que la clase tendra unc ontructor con todos los parametros
@NoArgsConstructor // Indicamos que la clase tendra un constructor sin parametros

@Entity
@Table(name = "Productos")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profile_info_seq_productos")
    @SequenceGenerator(name="profile_info_seq_productos",sequenceName = "profile_info_seq_productos",allocationSize = 1,initialValue = 10000)
    private Long idProducto;

    @Column(name = "nombreProducto", nullable = false) // Obligatorio
    private String nombreProducto;

    @Column(name = "precioProducto", nullable = false) // Obligatorio
    private int precioProducto;

    @Column(name = "categoriaProducto", nullable = false) // Obligatorio
    private String categoriaProducto;

    @Column(name = "stockProducto", nullable = false) // Obligatorio
    private int stockProducto;

    @Column(name = "sucursalId", nullable = false) // Obligatorio
    private Long sucursalId;
}
