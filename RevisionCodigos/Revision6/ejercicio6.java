package com.Problema;
import java.util.Scanner;
//Importamos el scanner


public class codigo6 {
	 
	public static void main (String []args) {
		//Main es el punto de entrada de la aplicación, sin la función main no funciona el programa
	Scanner scaner = new Scanner(System.in);
	
	//Creamos el array para retener numeros entereos
	int[] numbers = new int[20];

	
	//Obtener numeros random del 0 al 19, que es un numero aleatorio por 20 ocasiones. 
    for (int i = 0; i < 20; i++) {
    	numbers[i] = (int)(Math.random() * 381) + 20;
    	System.out.println(numbers[i] + " ");
    }
    
    
    System.out.println("\n¿Qué números quiere resaltar? ");
    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");

    int opcion = scaner.nextInt();
    
    int multiplo = (opcion == 1) ? 5: 7;

    for (int e : numbers) {
      if (e % multiplo == 0) {
        System.out.print("[" + e + "] ");}
       else {
        System.out.print(e + " ");
      }
    }
  
    }
}
