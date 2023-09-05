package com.javeriana.quickparked.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javeriana.quickparked.model.Piso;


public interface PisoRepository extends JpaRepository<Piso,Long>{
    
}
