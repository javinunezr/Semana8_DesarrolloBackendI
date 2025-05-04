package com.duoc.RopaStoreValidation.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @SequenceGenerator(name = "profile_info_seq_productos", sequenceName = "profile_info_seq_productos", allocationSize = 1, initialValue = 10000)
    private Long idProducto;

    @NotNull
    @Column(name = "nombreProducto", nullable = false) // Obligatorio
    @Size(min = 1, max = 40)
    private String nombreProducto;

    @NotNull
    @Column(name = "precioProducto", nullable = false) // Obligatorio
    @Min(1)
    private int precioProducto;

    @NotNull
    @Column(name = "categoriaProducto", nullable = false) // Obligatorio
    @Size(min = 1, max = 25)
    private String categoriaProducto;

    @NotNull
    @Column(name = "stockProducto", nullable = false) // Obligatorio
    @Min(0)
    private int stockProducto;

    @NotNull
    @Column(name = "sucursalId", nullable = false) // Obligatorio
    @Size(min = 1, max = 15)
    private Long sucursalId;
}
