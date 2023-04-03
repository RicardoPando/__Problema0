package com.upc.problema0;

public abstract class Concursante {
    private String dni;
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer numeroDeMensajes;

    public Concursante(String dni, String nombre, String apellido, Integer edad, Integer numeroDeMensajes) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroDeMensajes = numeroDeMensajes;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getNumeroDeMensajes() {
        return numeroDeMensajes;
    }

    public void setNumeroDeMensajes(Integer numeroDeMensajes) {
        this.numeroDeMensajes = numeroDeMensajes;
    }

    @Override
    public String toString() {
        return "Concursante{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", numeroDeLlamadas=" + numeroDeMensajes +
                '}';
    }

    public Integer calcPuntaje()
    {
        return 0;
    }

}
