package com.duoc.RopaStoreValidation.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Esta notacion incluye metodos: Setters, Getters & toString
@AllArgsConstructor // Indicamos que la clase tendra unc ontructor con todos los parametros
@NoArgsConstructor // Indicamos que la clase tendra un constructor sin parametros

public class Pedidos {
    private long idPedido;
    private long idCliente;
    private Date fechaPedido;
    private int totalPedido;
    private String estadoPedido;
}
