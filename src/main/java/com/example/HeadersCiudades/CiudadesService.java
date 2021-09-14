package com.example.HeadersCiudades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CiudadesService {
    List<Ciudad> ciudades = new ArrayList<>();

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public void añadir(Ciudad ciudad){
        //ciudades[ciudades.size()]=ciudad;
        ciudades.add(ciudad);
    }
}
