package com.javeriana.quickparked.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class TipoVehiculo {
    @Id
    @GeneratedValue
    Long id;

    String nombre;

    Integer tarifa;

    Double ancho;

    Double largo;

    @OneToMany(mappedBy = "tipoVehiculo")
    List<Piso> listaPisos;

    public TipoVehiculo(){

    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getLargo() {
        return largo;
    }

    public void setTarifa(Integer tarifa) {
        this.tarifa = tarifa;
    }

    public Integer getTarifa() {
        return tarifa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

}
