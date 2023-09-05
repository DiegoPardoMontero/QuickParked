package com.javeriana.quickparked.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Parqueadero {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String nombre;

    Integer tarifaMoto;

    Integer tarifaCarro;

    Integer tarifaBus;

    @OneToMany(mappedBy = "parqueaderoActual")
    List<Piso> listaPisosActual;

    @OneToMany(mappedBy = "parqueaderoAntiguo")
    List<Piso> listaPisosPasados;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaPisosActual(List<Piso> listaPisosActual) {
        this.listaPisosActual = listaPisosActual;
    }

    public void setListaPisosPasados(List<Piso> listaPisosPasados) {
        this.listaPisosPasados = listaPisosPasados;
    }

    public void setTarifaBus(Integer tarifaBus) {
        this.tarifaBus = tarifaBus;
    }

    public void setTarifaCarro(Integer tarifaCarro) {
        this.tarifaCarro = tarifaCarro;
    }

    public void setTarifaMoto(Integer tarifaMoto) {
        this.tarifaMoto = tarifaMoto;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Piso> getListaPisosActual() {
        return listaPisosActual;
    }

    public List<Piso> getListaPisosPasados() {
        return listaPisosPasados;
    }

    public Integer getTarifaBus() {
        return tarifaBus;
    }

    public Integer getTarifaCarro() {
        return tarifaCarro;
    }

    public Integer getTarifaMoto() {
        return tarifaMoto;
    }
}
