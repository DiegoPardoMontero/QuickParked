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

    public void modificarPiso(Integer numPiso, Piso pisoModificado){
        Piso pisoModificar = recuperarPiso(numPiso);
        pisoModificar = pisoModificado;
        guardarPiso(pisoModificar);
    }

    public Piso recuperarPiso(Integer numPiso){
        return pisoRepository.findByNumPiso(numPiso);
    }

    public void eliminarPiso(Integer numPiso){
        pisoRepository.deleteByNumPiso(numPiso);
    }

    public void especificarTipoVehiculo(Integer numPiso, String tipoVehiculo){
        Piso piso = recuperarPiso(numPiso);
        piso.setTipoVehiculo(tipoVehiculo);
        if(tipoVehiculo.equals("Moto")){
            piso.setNumEspacios(40);
        }
        else if(tipoVehiculo.equals("Carro")){
            piso.setNumEspacios(20);
        }
        else if(tipoVehiculo.equals("Bus")){
            piso.setNumEspacios(10);
        }
        pisoRepository.save(piso);
    }
}
