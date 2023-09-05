package com.javeriana.quickparked.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javeriana.quickparked.repository.VehiculoRepository;

@Service
public class VehiculoService {
    @Autowired
    VehiculoRepository vehiculoRepository;
}
