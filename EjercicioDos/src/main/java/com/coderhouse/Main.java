package com.coderhouse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	//Array para las personas
	   public static void main(String[] args) {
	        List<Persona> listaPersonas = new ArrayList<>();

	        // Se crean 5 objetos persona con nombres y apellidos en español    
	        listaPersonas.add(new Persona("Ignacio", "Mendoz"));
	        listaPersonas.add(new Persona("Leonel", "Messi"));
	        listaPersonas.add(new Persona("Julian", "Alvarez"));
	        listaPersonas.add(new Persona("Melany", "Unsa"));
	        listaPersonas.add(new Persona("Pablo", "Picasso"));

	        //Muestro la lista original
	        
	        System.out.println("Lista original:");
	        imprimirLista(listaPersonas);

	        // Ordenado por los nombre
	        
	        Collections.sort(listaPersonas, Comparator.comparing(Persona::getNombre));
	        System.out.println("\nOrdenado por los nombres:");
	        imprimirLista(listaPersonas);

	        // Ordenado por los apellidos
	        
	        Collections.sort(listaPersonas, Comparator.comparing(Persona::getApellido));
	        System.out.println("\nOrdenado por los apellidos :");
	        imprimirLista(listaPersonas);

	        // Orden Inverso
	        Collections.sort(listaPersonas, Comparator.comparing(Persona::getApellido).reversed());
	        System.out.println("\nOrdenado a la inversa por apellido:");
	        imprimirLista(listaPersonas);
	    }

	   
	    private static void imprimirLista(List<Persona> lista) {
	        for (Persona persona : lista) {
	            System.out.println(persona);
	        }
	    }
	}