package com.example.demo;

public class User {
   static String table = "tb_user";
   public double id = Math.random();
   public String name;
   public int edad;

   User() {

   }   

   User(String name, int edad) {
       this.name = name;
       this.edad = edad;
   }


   public void ingreso() {
      boolean isLogged = true;
           if (isLogged == true) {
              System.out.println("¡Bienvenido " + this.name + " \nregistro de la tabla " + table);
           } else {
             System.out.println("Hola invitado, por favor ingresa a tu cuenta.");
           }
   }
}
