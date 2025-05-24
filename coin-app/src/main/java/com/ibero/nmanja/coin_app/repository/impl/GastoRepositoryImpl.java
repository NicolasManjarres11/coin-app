package com.ibero.nmanja.coin_app.repository.impl;

import java.util.ArrayList;
import java.util.List;

import com.ibero.nmanja.coin_app.model.Gasto;
import com.ibero.nmanja.coin_app.repository.GastoRepository;

public class GastoRepositoryImpl implements GastoRepository{

    private List<Gasto> gastos;
    private Long idCounter = 1L;

    public GastoRepositoryImpl(){
        gastos = new ArrayList<>();
    }

    @Override
    public List<Gasto> findAll() {
        return gastos;
    }

    @Override
    public Gasto save(Gasto gasto) {
        gasto.setId(idCounter++);
        gastos.add(gasto);
        return gasto;
    }
    
}
