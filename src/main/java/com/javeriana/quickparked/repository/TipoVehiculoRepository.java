package com.javeriana.quickparked.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javeriana.quickparked.model.TipoVehiculo;

public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculo, Long> {
    TipoVehiculo findByNombre(String nombre);
}
