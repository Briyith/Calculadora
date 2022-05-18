package com.prueba.calculadora;



import javax.swing.JOptionPane;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraApplication {

	public static void main(String[] args) {

		//Optenemos la informacíon mediante una ventana emergente:
		String num1 = JOptionPane.showInputDialog("Introduzca un número entero:");
		String num2 = JOptionPane.showInputDialog("Introduzca un número entero:");
		
		//Convertimos los valores ingresados a enteros, los pasamos por parametro, obtenemos el valor de la operación 
		//y por ultimo imprimimos por pantalla.
		System.out.println("------OPERACIONES MATEMATICAS------ \n Los numeros ingresados son: "+ num1+" y " + num2);
		System.out.println("La suma es Igual: " + suma( Integer.valueOf(num1), Integer.valueOf(num2)));
		System.out.println("La resta es Igual: " + resta( Integer.valueOf(num1), Integer.valueOf(num2)));
		System.out.println("La multiplicación es Igual: " + multiplicacion( Integer.valueOf(num1), Integer.valueOf(num2)));
		System.out.println("La división es Igual: " + division( Integer.valueOf(num1), Integer.valueOf(num2)));
        
	}

	
	// Retorna la suma de dos numeros enteros
	   public  static int suma(int num1, int num2) {	
		   return num1 + num2;
	   }
	
	// Retorna la resta de dos numeros enteros
		public static int resta(int num1, int num2) {	
			return num1 - num2;
		}
		
    // Retorna la multiplicación de dos numeros enteros
		public static int multiplicacion(int num1, int num2) {	
			return num1 * num2;
		}
		
	// Retorna la división de dos numeros enteros
		public static double division(int num1, int num2) {	
			return num1/num2;
		}
		
		
		
	
	

}
