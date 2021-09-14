package com.example.HeadersCiudades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@SpringBootApplication
@RestController
public class Controlador2 {

    @Autowired
    CiudadesService ciudades;
    //List<Ciudad> ciudades;

    @GetMapping("/controlador2/getCiudad")
    public CiudadesService recibePersona()
    {

        return ciudades;
    }
}
