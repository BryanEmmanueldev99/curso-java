package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		/**-- Orientación a Objetos -- */
        User user = new User("Jesus", 2);
		user.ingreso();
		

		// User user2 = new User();
		// user2.name = "Gabriel";
		// user2.edad = 60;

		// System.out.println(user.name + " edad " + user.edad + " id usuario es: " + user.id);
		// System.out.println(user2.name + " edad " + user2.edad + " id usuario es: " + user.id);


		
		

		/*Datos primitivos */
	// 	short edad = 19; //ideal para numeros pequeños
	// 	long numLargo = 10000; //short
    //     float price = 20.30f;  //float
	// 	boolean isActive = true; //booleano "cierto" o "verdadero"
	// 	char curso = 'U';  //char


	/*Strings */
	// 	String txt = "Hey Javascript";

	//    int Largo = txt.length();
	//    String remplaza = txt.replace("Javascript", "C++ii");
	//    String con_espacios = "     Hola Miguel   ";
	//    String directorio = "C:\\Hola \"Mundo\">";
	//    String n = "Hola \nMundo";
	//    String t = "Hola \tMundo";
	   //Los String son inmutables

	//    System.out.println(txt.startsWith("Hey"));
	//    System.out.println(txt.indexOf("v"));
	//    System.out.println(txt.toLowerCase());
	//    System.out.println(txt.toUpperCase());
	//    System.out.println(remplaza.toUpperCase());
	//    System.out.println(con_espacios.trim());
	
	/*Arreglos */
	// int[] num = new int[7];
	// String myarray[] = {"Juanes","Pedro","Java"};
	// int[] numDos = {1,2,3};
	// int[][] multidimensional = { {1,2} , {3,5,7} };
	// num[2] = 7;
	
	// Arrays.sort(num);
	// System.out.println(Arrays.toString(num));
	// System.out.println("Cantidad de datos en el array: " + num.length);
	// System.out.println(Arrays.toString(numDos));
	// System.out.println(Arrays.deepToString(multidimensional));

	// for(String row : myarray) {
	// 	System.out.println(row);
	// }

	/*CONSTANTES */
	//final String name = "Bryan";
	// name = "Luis";

	/*Condicionales y bucles */
	// int edad = 24;
    // String mensaje = edad > 18 ? name + " ya puedes votar!" : name + " no puedes votar!";
	// String action = "agregar";

	// System.out.println(mensaje);
	// switch (action) {
	// 	case "agrega":
	// 		System.out.println("Agregando...");
	// 		break;
	// 	case "Eliminar":
	// 	     System.out.println("Borrando...");
	// 		break;
	// 	default: 
	// 	    System.out.println("Acción por defecto");
	// 		break;
	// }
	// if(edad > 18) {
	// 	mensaje = name + " ya puedes votar!";
	// } else {
	// 	mensaje = name + " no puedes votar!";
	// }
	
	//String array[] = {"Juanes","Pedro","Java"};

	// forma 1 
	// for(int i = 0; i < 5; i++) {
	// 	System.out.println(i);
	// }

	// forma 2 (Mas comoda de recorrer un array) for(String row : array) {
	// 	System.out.println(row);
	// }
	     
	  
	}

}
