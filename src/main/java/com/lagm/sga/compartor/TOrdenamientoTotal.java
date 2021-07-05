package com.lagm.sga.compartor;

import java.util.ArrayList;
import java.util.Collections;

public class TOrdenamientoTotal {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona(1, "Maria", 185));
        listaPersonas.add(new Persona(2, "Carla", 190));
        listaPersonas.add(new Persona(3, "Yovana", 170));
        
        // Ordenación natural
        Collections.sort(listaPersonas, new OrdenarPersonaPorAltura());
        System.out.println("Personas ordenadas por orden natural: " + listaPersonas);
    }
}
