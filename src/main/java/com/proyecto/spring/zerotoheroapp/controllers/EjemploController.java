package com.proyecto.spring.zerotoheroapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyecto.spring.zerotoheroapp.models.Empleados;


@Controller
public class EjemploController {

    @GetMapping("/detalles_info")

    public String info(Model model) {
        Empleados empleado1 = new Empleados("Juan", "Rodriguez","Calle Falsa","Dev",20,12345678,001);
        model.addAttribute("Empleado", empleado1);
        return "detalles_info";
    }
}
