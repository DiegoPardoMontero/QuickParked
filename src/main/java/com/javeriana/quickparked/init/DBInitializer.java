package com.javeriana.quickparked.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.javeriana.quickparked.model.Piso;
import com.javeriana.quickparked.model.TipoVehiculo;

import com.javeriana.quickparked.repository.ParqueaderoRepository;
import com.javeriana.quickparked.repository.PisoRepository;
import com.javeriana.quickparked.repository.TipoVehiculoRepository;
import com.javeriana.quickparked.service.ParqueaderoService;
import com.javeriana.quickparked.service.PisoService;

import jakarta.transaction.Transactional;

@Component
public class DBInitializer implements CommandLineRunner {
    TipoVehiculo t;

    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    TipoVehiculoRepository tipoVehiculoRepository;

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
        //Agregar los 3 tipos de vehiculo
        TipoVehiculo moto = new TipoVehiculo();
        TipoVehiculo carro = new TipoVehiculo();
        TipoVehiculo bus = new TipoVehiculo();
        moto.setNombre("Moto");
        moto.setAncho(1.0);
        moto.setLargo(2.0);
        carro.setNombre("Carro");
        carro.setAncho(2.0);
        carro.setLargo(4.0);
        bus.setNombre("Bus");
        bus.setAncho(2.0);
        bus.setLargo(10.0);
        tipoVehiculoRepository.save(moto);
        tipoVehiculoRepository.save(carro);
        tipoVehiculoRepository.save(bus);


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
    }
}
