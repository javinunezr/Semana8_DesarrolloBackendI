package com.duoc.RopaStoreValidation.models;

import java.util.Date;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Esta notacion incluye metodos: Setters, Getters & toString
@Data
@AllArgsConstructor // Indicamos que la clase tendra unc ontructor con todos los parametros
@NoArgsConstructor // Indicamos que la clase tendra un constructor sin parametros

@Entity
@Table(name = "Pedidos")
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profile_info_seq_pedidos")
    @SequenceGenerator(name = "profile_info_seq_pedidos", sequenceName = "profile_info_seq_pedidos", allocationSize = 1, initialValue = 100)
    private Long idPedido;

    @NotNull
    @Column(name = "idCliente", nullable = false) // Obligatorio
    private Long idCliente;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaPedido", nullable = false) // Obligatorio
    private Date fechaPedido;

    @NotNull
    @Column(name = "totalPedido", nullable = false) // Obligatorio
    @Min(1)
    private int totalPedido;

    @NotNull
    @Column(name = "estadoPedido", nullable = false) // Obligatorio
    @Size(min = 1, max = 15)
    private String estadoPedido;
}