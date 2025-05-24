package com.ibero.nmanja.coin_app.model;

import java.time.LocalDate;

import lombok.Data;


@Data
public class GastoController {

    private Long id;
    private String cuenta;
    private Double monto;
    private LocalDate fecha;


    
}
