package com.ibero.nmanja.coin_app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibero.nmanja.coin_app.model.Gasto;
import com.ibero.nmanja.coin_app.repository.GastoRepository;
import com.ibero.nmanja.coin_app.service.GastoService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class GastoServiceImpl implements GastoService{

    private final GastoRepository gastoRepository;



    @Override
    public List<Gasto> getGastos() {

        return gastoRepository.findAll();
    }

    @Override
    public Gasto guardarGasto(Gasto gasto) {

        return gastoRepository.save(gasto);
    }
    
}
