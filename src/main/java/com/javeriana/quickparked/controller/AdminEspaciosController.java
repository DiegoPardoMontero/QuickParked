package com.javeriana.quickparked.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.javeriana.quickparked.model.Piso;
import com.javeriana.quickparked.model.TipoVehiculo;
import com.javeriana.quickparked.service.TipoVehiculoService;

@Controller
@RequestMapping("/adminEspacios")
public class AdminEspaciosController {
    @Autowired
    public TipoVehiculoService tipoVehiculoService;

    @GetMapping("/cargarPagina")
    public ModelAndView listarTarifas() {
        Piso piso = new Piso();
        TipoVehiculo tipoVeh = new TipoVehiculo();
        ModelAndView personListView = new ModelAndView("adminEspacios");
        personListView.addObject("piso", piso);
        personListView.addObject("tipoVeh", tipoVeh);
        return personListView;
    }

    @PostMapping("/saveTarifa")
    public RedirectView guardarTarifa(@ModelAttribute TipoVehiculo tipoVeh) {
        System.out.println("ID recibido: " + tipoVeh.getId()); // Solo para depuración
        tipoVehiculoService.modificarTipoVeh(tipoVeh.getId(), tipoVeh);        
        return new RedirectView("/adminEspacios/cargarPagina");
    }   
}
