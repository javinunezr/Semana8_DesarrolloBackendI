package com.duoc.RopaStoreValidation.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Esta notacion incluye metodos: Setters, Getters & toString
@AllArgsConstructor // Indicamos que la clase tendra unc ontructor con todos los parametros
@NoArgsConstructor // Indicamos que la clase tendra un constructor sin parametros

public class Productos {
    private long idProducto;
    private String nombreProducto;
    private int precioProducto;
    private String categoriaProducto;
    private int stockProducto;
    private long sucursalId;
}
