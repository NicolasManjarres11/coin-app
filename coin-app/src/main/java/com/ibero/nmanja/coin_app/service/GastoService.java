package com.ibero.nmanja.coin_app.service;

import java.util.List;

import com.ibero.nmanja.coin_app.model.Gasto;

public interface GastoService {

    List<Gasto> getGastos();
    Gasto guardarGasto(Gasto gasto);

    
}
