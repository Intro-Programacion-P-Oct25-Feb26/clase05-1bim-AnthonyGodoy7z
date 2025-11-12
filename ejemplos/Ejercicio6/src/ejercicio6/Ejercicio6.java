/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        String apellido;
        int edad;
        String parroquia;
        int dia;
        int membresia = 25;
        double descuento;
        double total;
        
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su parroquia residente");
        parroquia = entrada.nextLine();
        System.out.println("Ingrese su dia de pago");
        dia = entrada.nextInt();
        
        if (dia>10 && (parroquia.equals("El Valle") || 
                parroquia.equals("El Sagrario")));{
        descuento = membresia * 0.15;
        total = membresia - descuento;
        System.out.println("Nombre: %s\nApellido: %s\nEdad: %d\n"
                + "Parroquia: %s\nDia de pago: %d\nDescuento realizado: %.2f\n"
                + "Total a pagar: %.2f",nombre,apellido,edad,
                parroquia,dia,membresia,total);
    }
        
    }
    
}
