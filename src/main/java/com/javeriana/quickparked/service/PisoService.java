package com.javeriana.quickparked.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javeriana.quickparked.model.Piso;
import com.javeriana.quickparked.repository.PisoRepository;

@Service
public class PisoService {
    @Autowired
    PisoRepository pisoRepository;

    public void guardarPiso(Piso piso){
        pisoRepository.save(piso);
    }

    public void modificarPiso(Long id, String tipoVehiculo){
        Piso pisoModificar = recuperarPiso(id);
        pisoModificar.setTipoVehiculo(tipoVehiculo);
        guardarPiso(pisoModificar);
    }

    public Piso recuperarPiso(Long id){
        return pisoRepository.findById(id).orElseThrow();
    }

    public void eliminarPiso(Long id){
        pisoRepository.deleteById(id);
    }
}
