package com.javeriana.quickparked.service;

import java.lang.reflect.Field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javeriana.quickparked.model.TipoVehiculo;
import com.javeriana.quickparked.repository.TipoVehiculoRepository;

@Service
public class TipoVehiculoService {
    @Autowired
    TipoVehiculoRepository tipoVehiculoRepository;  

    public void guardarTipoVeh(TipoVehiculo tipoVeh){
        tipoVehiculoRepository.save(tipoVeh);
    }

    public TipoVehiculo recuperarTipoVeh(Long id){
        return tipoVehiculoRepository.findById(id).orElseThrow();
    }
    
    public void modificarTipoVeh(Long id, TipoVehiculo tipoVeh) {
        TipoVehiculo tipoVehiculoModificar = recuperarTipoVeh(id);
    
        for (Field field : TipoVehiculo.class.getDeclaredFields()) {
            field.setAccessible(true); // Permite acceder a campos privados
    
            try {
                Object newValue = field.get(tipoVeh);
                Object oldValue = field.get(tipoVehiculoModificar);
    
                // Si el nuevo valor no es null y es diferente al valor antiguo, actualizamos el campo
                if (newValue != null && !newValue.equals(oldValue)) {
                    field.set(tipoVehiculoModificar, newValue);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace(); // O maneja la excepción de la manera que prefieras
            }
        }
    
        guardarTipoVeh(tipoVehiculoModificar);
    }

    public TipoVehiculo recuperarTipoVeh(String name){
        TipoVehiculo t = tipoVehiculoRepository.findByNombre(name);
        return t;
    }

    public void eliminarPiso(Long id){
        tipoVehiculoRepository.deleteById(id);
    }

}
