package com.javeriana.quickparked.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javeriana.quickparked.model.Parqueadero;
import com.javeriana.quickparked.repository.ParqueaderoRepository;

@Service
public class ParqueaderoService {
    @Autowired
    ParqueaderoRepository parqueaderoRepository;

    public Parqueadero recuperarParqueadero(Long id){
        return parqueaderoRepository.findById(id).orElseThrow();
    }
}
