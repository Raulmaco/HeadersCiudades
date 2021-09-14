package com.example.HeadersCiudades;

import org.springframework.stereotype.Component;

@Component
public class Ciudad  implements CiudadI{
    String nombre;
    int numerohabitantes;

    public Ciudad(String nombre, int numerohabitantes) {
        this.nombre = nombre;
        this.numerohabitantes = numerohabitantes;
    }

    public Ciudad() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumerohabitantes() {
        return numerohabitantes;
    }

    public void setNumerohabitantes(int numerohabitantes) {
        this.numerohabitantes = numerohabitantes;
    }
}
