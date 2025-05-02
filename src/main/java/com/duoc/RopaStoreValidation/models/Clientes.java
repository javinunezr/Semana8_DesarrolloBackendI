package com.duoc.RopaStoreValidation.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Esta notacion incluye metodos: Setters, Getters & toString
@AllArgsConstructor // Indicamos que la clase tendra unc ontructor con todos los parametros
@NoArgsConstructor // Indicamos que la clase tendra un constructor sin parametros

public class Clientes {
    private long idCliente;
    private String rutCliente;
    private String nombreCliente;
    private String correoCliente;
    private int telefonoCliente;
    private String direccionCliente; 
}
