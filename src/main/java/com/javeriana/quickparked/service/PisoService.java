package com.javeriana.quickparked.service;

import java.lang.reflect.Field;

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
        pisoModificar.setTipoVehiculo(pisoModificado.getTipoVehiculo());

        for (Field field : Piso.class.getDeclaredFields()) {
            field.setAccessible(true); // Permite acceder a campos privados
    
            try {
                Object newValue = field.get(pisoModificar);
                Object oldValue = field.get(pisoModificado);
    
                // Si el nuevo valor no es null y es diferente al valor antiguo, actualizamos el campo
                if (newValue != null && !newValue.equals(oldValue)) {
                    field.set(pisoModificar, newValue);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace(); // O maneja la excepción de la manera que prefieras
            
            }
        }

        guardarPiso(pisoModificar);
    }

    public Piso recuperarPiso(Integer numPiso){
        return pisoRepository.findByNumPiso(numPiso);
    }

    public void eliminarPiso(Integer numPiso){
        pisoRepository.deleteByNumPiso(numPiso);
    }
}
