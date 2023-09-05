package com.javeriana.quickparked.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javeriana.quickparked.model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long>{
    
}
