package com.duoc.RopaStoreValidation.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Pedidos")
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPedido")
    private Long idPedido;

    @Column(name = "idCliente", nullable = false) // Obligatorio
    private Long idCliente;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaPedido", nullable = false) // Obligatorio
    private Date fechaPedido;

    @Column(name = "totalPedido", nullable = false) // Obligatorio
    private int totalPedido;

    @Column(name = "estadoPedido", nullable = false) // Obligatorio
    private String estadoPedido;

    // Getters y setters

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public int getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(int totalPedido) {
        this.totalPedido = totalPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
}