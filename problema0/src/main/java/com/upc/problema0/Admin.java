package com.upc.problema0;
import java.util.ArrayList;
import java.util.List;

public class Admin {
    private List <Concursante> concursantes = new ArrayList<>();

    public void  adicionar(Concursante concursante){concursantes.add(concursante);}

    public List<Concursante> listado(){return this.concursantes;}

}
