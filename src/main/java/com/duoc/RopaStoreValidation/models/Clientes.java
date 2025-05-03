package com.duoc.RopaStoreValidation.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente")
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

    // Getters y setters

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
}
