package com.sofka.firstproject;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingresa tu nombre de usuario: ");
        String name = captura.nextLine();
        System.out.println("Ingresa tu celular: ");
        String cell = captura.nextLine();
        System.out.println("Ingresa tu edad: ");
        String age = captura.nextLine();
        System.out.println("Bienvenido señor " +name + " es un placer para nosotros contar con una persona de "+age +" años.\n" +
                "\n" +
                "Próximamente nos comunicaremos con usted al numero "+cell +"\n" +
                "\n" +
                "Feliz día");




    }
}
