package com.javeriana.quickparked.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javeriana.quickparked.model.Parqueadero;

public interface ParqueaderoRepository extends JpaRepository<Parqueadero, Long>{
    
}
