package com.Problema;
import java.util.Scanner;
//Se sumo el import al documento


public class EntregaProblema {
		
	
	public static void main (String [ ]args) {
	
	
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Introduzca un número: ");
	    int ni = scanner.nextInt();
	    String numeroString = Integer.toString(ni);
	    
	    /*
	    	Borramos c para poder sustituirlo por numeroString para así evaluar el length 
	     * Pues si el numero solo contenia un dígito el loop se volvia infinito al no poder evaluar la condición
	     * Se le añadio un break para evitar lo anterior, además que se saco del scoop de
	     * del loop el seugndo if que evaluava si unn  nuero era afortunado o no
	     *  
	     *  
	     *  */
	    
	    int afortunado = 0;
	    int noAfortunado = 0;
	    
	    while (ni > 0) {
		  int digito = numeroString.length();
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afortunado++;
			break;
			
	      } else {
	    	 
			noAfortunado++;
		  break;
		  
	    }
	      
	    }
	      
	    if (afortunado > noAfortunado) {
	      System.out.println("El " + ni + " es un número afortunado.");
	    } else {
	      System.out.println("El " + ni + " no es un número afortunado.");
	    }
	    
	  
	}
}
	
