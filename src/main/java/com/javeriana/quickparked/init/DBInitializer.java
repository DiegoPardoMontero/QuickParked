package com.javeriana.quickparked.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.javeriana.quickparked.model.Parqueadero;
import com.javeriana.quickparked.model.Piso;
import com.javeriana.quickparked.repository.ParqueaderoRepository;
import com.javeriana.quickparked.repository.PisoRepository;
import com.javeriana.quickparked.service.ParqueaderoService;
import com.javeriana.quickparked.service.PisoService;

import jakarta.transaction.Transactional;

@Component
public class DBInitializer implements CommandLineRunner {

    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    PisoService pisoService;

    @Autowired
    ParqueaderoService parqueaderoService;

    @Autowired
    PisoRepository pisoRepository;

    @Autowired
    ParqueaderoRepository parqueaderoRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        //Datos de Simulación

        //===========PRUEBA CRUD==============

        //Agregar pisos nuevos PRUEBA CREATE
        Piso piso1 = new Piso(1);
        Piso piso2 = new Piso(2);
        Piso piso3 = new Piso(3);
        Piso piso4 = new Piso(4);
        pisoService.guardarPiso(piso1);
        pisoService.guardarPiso(piso2);
        pisoService.guardarPiso(piso3);
        pisoService.guardarPiso(piso4);

        //Agregar nuevo parqueadero
        Parqueadero parqueadero = new Parqueadero();
        parqueaderoRepository.save(parqueadero);

        //Borrar un piso PRUEBA DELETE
        pisoService.eliminarPiso(2);

        //Agrega de nuevo el piso eliminado
        pisoService.guardarPiso(new Piso(2));

        //Vinculación de los pisos con el parqueadero
        long b = 1;
        Parqueadero par = parqueaderoService.recuperarParqueadero(b);
        for (Piso piso : pisoRepository.findAll()){
            piso.setParqueaderoActual(par);
            pisoRepository.save(piso);
        }

        //Recuperar un piso PRUEBA READ
        Piso pisoTres = pisoService.recuperarPiso(3);
        pisoTres.setTipoVehiculo("Bus");

        //Actualizar un piso PRUEBA UPDATE
        pisoService.modificarPiso(3, pisoTres);
    

        //================PRUEBA ESPECIFICAR TIPO VEHICULO=====================
        pisoService.especificarTipoVehiculo(1, "Moto");
        pisoService.especificarTipoVehiculo(2, "Carro");
        pisoService.especificarTipoVehiculo(3, "Carro");
        pisoService.especificarTipoVehiculo(4, "Bus");


        //===============PRUEBA ESPECIFICAR TARIFAS==================
        parqueaderoService.especificarTarifas(b, 50, 10, 100);

    }
}
