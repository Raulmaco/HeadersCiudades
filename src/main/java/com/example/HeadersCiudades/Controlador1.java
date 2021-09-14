package com.example.HeadersCiudades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class Controlador1 {

    @Autowired
    CiudadesService ciudades;
    //List<Ciudad> ciudades;
    // Controlador1(List<Ciudad>){}

    int i =0;


    @PostMapping ("/controlador1/addCiudad")
    public Ciudad recibePersona(@RequestHeader(required = true) String nombre, @RequestHeader(required = false) Integer numerohabitantes)
    {

        if (numerohabitantes==null){
            numerohabitantes=0;
        }

        Ciudad ciudad = new Ciudad(nombre, numerohabitantes);
        ciudades.añadir(ciudad);
        return ciudad;
    }

}
