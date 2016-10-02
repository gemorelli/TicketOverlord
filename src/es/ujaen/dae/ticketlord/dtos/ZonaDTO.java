package es.ujaen.dae.ticketlord.dtos;

public class ZonaDTO {
    private Character nombre;
    private Integer asientos;

    @Override
    public String toString() {
        return "ZonaDTO{" +
                "nombre=" + nombre +
                ", asientos=" + asientos +
                '}';
    }

    public Character getNombre() {
        return nombre;
    }

    public void setNombre(Character nombre) {
        this.nombre = nombre;
    }

    public Integer getAsientos() {
        return asientos;
    }

    public void setAsientos(Integer asientos) {
        this.asientos = asientos;
    }
}
