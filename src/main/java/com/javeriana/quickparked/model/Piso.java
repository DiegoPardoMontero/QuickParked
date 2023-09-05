package com.javeriana.quickparked.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Piso {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @ManyToOne
    Parqueadero parqueaderoActual;

    @ManyToOne
    Parqueadero parqueaderoAntiguo;

    Double ancho;

    Double largo;

    Integer numEspacios;

    String tipoVehiculo;

    @OneToMany(mappedBy = "piso")
    List<Vehiculo> listaVehiculos;

    Double porcentajeOcupado;

    Integer tarifa;

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public void setNumEspacios(Integer numEspacios) {
        this.numEspacios = numEspacios;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
        if(tipoVehiculo == "Moto"){
            this.setNumEspacios(40);
        }
        else if(tipoVehiculo == "Carro"){
            this.setNumEspacios(20);
        }
        else if(tipoVehiculo == "Bus"){
            this.setNumEspacios(10);
        }
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public void setPorcentajeOcupado(Double porcentajeOcupado) {
        this.porcentajeOcupado = porcentajeOcupado;
    }
    
    public void setTarifa(Integer tarifa) {
        this.tarifa = tarifa;
    }

    public Long getId() {
        return id;
    }

    public Double getAncho() {
        return ancho;
    }
    
    public Double getLargo() {
        return largo;
    }

    public Integer getNumEspacios() {
        return numEspacios;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public Double getPorcentajeOcupado() {
        return porcentajeOcupado;
    }

    public Integer getTarifa() {
        return tarifa;
    }
}
