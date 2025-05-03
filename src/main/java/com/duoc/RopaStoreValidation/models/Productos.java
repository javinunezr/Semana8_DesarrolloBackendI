package com.duoc.RopaStoreValidation.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Productos")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProducto")
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

    // Getters y setters

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    public Long getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(Long sucursalId) {
        this.sucursalId = sucursalId;
    }
}
