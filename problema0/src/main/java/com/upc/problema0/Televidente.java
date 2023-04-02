package com.upc.problema0;

public class Televidente extends Concursante {
    public Televidente(String dni, String nombre, String apellido, Integer edad, Integer numeroDeMensajes, Integer numeroDeLlamadas) {
        super(dni, nombre, apellido, edad, numeroDeMensajes);
        this.numeroDeLlamadas = numeroDeLlamadas;
    }

    private Integer numeroDeLlamadas;

    @Override
    public Integer getNumeroDeMensajes() {
        return numeroDeLlamadas;
    }
    @Override
    public void setNumeroDeMensajes(Integer numeroDeMensajes) {
        this.numeroDeLlamadas = numeroDeMensajes;
    }
    public Integer calcPuntaje()
    {
        int puntaje=0;
        return puntaje=super.getNumeroDeMensajes()*4+numeroDeLlamadas*3;
    }

}
