package com.invoiceservice.api.invoice.dto;

import lombok.Data;

@Data
public class DtoCustomer {

    private int id;
    private String nombre;
    private String apellidos;
    private String rfc;
    private String correo;
    // private Region region;
}
