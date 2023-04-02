package com.upc.problema0;

import com.upc.problema0.enums.Equipo;

public class FanMasacre extends Concursante
{

    private Equipo nombre_Equipo;
    private Integer puntaje_Equipo;
    private Integer puntaje_Batta;

    public FanMasacre(String dni, String nombre, String apellido, Integer edad, Integer numeroDeMensajes) {
        super(dni, nombre, apellido, edad, numeroDeMensajes);
    }

    public Integer calcPuntaje()
    {
        int puntaje=0;
        return (puntaje = (super.getNumeroDeMensajes() * 4) + puntaje_Batta + puntaje_Equipo * 2);
    }

    public FanMasacre(String dni, String nombre, String apellido, Integer edad, Integer numeroDeMensajes, Equipo nombre_Equipo, Integer puntaje_Equipo, Integer puntaje_Batta) {
        super(dni, nombre, apellido, edad, numeroDeMensajes);
        this.nombre_Equipo = nombre_Equipo;
        this.puntaje_Equipo = puntaje_Equipo;
        this.puntaje_Batta = puntaje_Batta;
    }

    public Equipo getNombre_Equipo() {
        return nombre_Equipo;
    }

    public void setNombre_Equipo(Equipo nombre_Equipo) {
        this.nombre_Equipo = nombre_Equipo;
    }

    public Integer getPuntaje_Equipo() {
        return puntaje_Equipo;
    }

    public void setPuntaje_Equipo(Integer puntaje_Equipo) {
        this.puntaje_Equipo = puntaje_Equipo;
    }

    public Integer getPuntaje_Batta() {
        return puntaje_Batta;
    }

    public void setPuntaje_Batta(Integer puntaje_Batta) {
        this.puntaje_Batta = puntaje_Batta;
    }

    @Override
    public String toString() {
        return "FanMasacre{" +
                "nombre_Equipo=" + nombre_Equipo +
                ", puntaje_Equipo=" + puntaje_Equipo +
                ", puntaje_Batta=" + puntaje_Batta +
                '}';
    }
}
