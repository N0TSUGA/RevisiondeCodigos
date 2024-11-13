package com.generation;

import java.util.Scanner;
//Se importo java.util.Scanner
//Se añadio (System.in) en Scanner s
//Se cambio el valor del segundo jugador a jugador 2 en el contexto
//Se utilizo equals en lugar de ==
//Se corrigio tijeras en lugar de tijera dentro de case


public class Codigo4 {

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    //Scanner s2 = new Scanner();
	    String j2 = s.nextLine();
	    
	    
	    if (j1 == j2) {
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	      	case "piedra":
	          if (j2.equals("tijeras")) {
	            g = 1;
	          }
	
	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 1;
	          }
	        case "tijeras":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
    }
  }
}
