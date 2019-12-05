package com.Elorrieta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BiblioAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Libro> listalibros = new ArrayList <Libro>();
		Scanner sc = new Scanner (System.in);
		String opcion ="";
		boolean finalizar = false;
	do {
		System.out.println("Inicio de proyecto");
		System.out.println("por favor, introduce la operación");
		System.out.println("A: Sacar libro");
		System.out.println("B: Devolver libro");
		System.out.println("S: Salir");
		System.out.println("Seleccione opción");
		
		
		opcion = sc.nextLine();
		
		switch (opcion) {
		case "A": listalibros.remove(0);
			
			break;
		case "B": listalibros.add(new Libro("Teo va al circo","Umeak001"));
			
			break;
		case "S":
			finalizar = true;
			break;

		default:
			break;
		}
	}while (finalizar == false); 
	}

}
