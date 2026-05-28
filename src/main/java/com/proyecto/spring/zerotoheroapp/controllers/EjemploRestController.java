package com.proyecto.spring.zerotoheroapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.spring.zerotoheroapp.models.Empleados;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api")
public class EjemploRestController {
    @GetMapping(path = "/detalles_info2")
    
    //@RequestMapping(path = "/detalles_info2", method = RequestMethod.GET)

    public Map<String, Object> detalles_info2() {

        Empleados empleado1 = new Empleados("Juan", "Rodriguez","Calle Falsa","Dev",20,12345678,001);

        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Empleado", "Datos empleado");
        respuesta.put("ZeroToHeroJavaEmpleado", empleado1);
        
        return respuesta;
    }
}
