package com.javeriana.quickparked.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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

    Integer numPiso;

    Double ancho;

    Double largo;

    Integer numEspacios;

    @ManyToOne
    @JoinColumn(name = "tipo_vehiculo_id")
    TipoVehiculo tipoVehiculo;

    @OneToMany(mappedBy = "piso")
    List<Vehiculo> listaVehiculos;

    Double porcentajeOcupado = 0.0;

    public Piso(){

    }

    public Piso(Integer numPiso){
        this.numPiso = numPiso;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public void setNumEspacios(Integer numEspacios) {
        this.numEspacios = numEspacios;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public void setPorcentajeOcupado(Double porcentajeOcupado) {
        this.porcentajeOcupado = porcentajeOcupado;
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

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public Double getPorcentajeOcupado() {
        return porcentajeOcupado;
    }

    public void setParqueaderoActual(Parqueadero parqueaderoActual) {
        this.parqueaderoActual = parqueaderoActual;
    }

    public void setParqueaderoAntiguo(Parqueadero parqueaderoAntiguo) {
        this.parqueaderoAntiguo = parqueaderoAntiguo;
    }

    public Parqueadero getParqueaderoAntiguo() {
        return parqueaderoAntiguo;
    }

    public Parqueadero getParqueaderoActual() {
        return parqueaderoActual;
    }

    public void setNumPiso(Integer numPiso) {
        this.numPiso = numPiso;
    }

    public Integer getNumPiso() {
        return numPiso;
    }
}
