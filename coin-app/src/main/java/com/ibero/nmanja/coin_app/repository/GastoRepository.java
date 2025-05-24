package com.ibero.nmanja.coin_app.repository;

import java.util.List;

import com.ibero.nmanja.coin_app.model.Gasto;

public interface GastoRepository {

    List<Gasto> findAll();
    Gasto save(Gasto gasto);
    
}
