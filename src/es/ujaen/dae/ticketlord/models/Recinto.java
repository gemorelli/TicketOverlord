package es.ujaen.dae.ticketlord.models;

import java.util.List;

public class Recinto {
    private String localidad;
    private String direccion;
    private List<Zona> zonas;

    public Recinto() {
    }

    public Recinto(String localidad, String direccion, List<Zona> zonas) {
        this.localidad = localidad;
        this.direccion = direccion;
        this.zonas = zonas;
    }

    @Override
    public String toString() {
        return "Recinto{" +
                "localidad='" + localidad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", zonas=" + zonas +
                '}';
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Zona> getZonas() {
        return zonas;
    }

    public void setZonas(List<Zona> zonas) {
        this.zonas = zonas;
    }
}
