package com.invoiceservice.api.invoice.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class DtoProduct {
	
    private int id;
    private String codigo;
    private String producto;
    private String descripcion;
    private double precio;
    private int cantidad;
    private LocalDate fecha_creacion;
    private int id_categoria;

}
