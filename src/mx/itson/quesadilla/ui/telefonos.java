/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.quesadilla.ui;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class telefonos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escribe los numeros");
        Scanner numList = new Scanner(System.in);//lee lo que se ingreso
        String numero = numList.nextLine();//se guarda en numero
        String replaces = numero//quita los parentesis, espacios y guiones de los numeros haciendo que queden las puras comas
                .replace("(", "")
                .replace(")", "")
                .replace(" ", "")
                .replace("-", "");

        String[] result1 = replaces.split(",");//parte en comas osea que guarda en posiciones
        int numGuaymas = 0;
        int numHermosillo = 0;
        int numTijuana = 0;
        int numDesconocido = 0;
        for (String s : result1) {//ciclo for para contar cuantas veces se repite cada cosa
            if (s.startsWith("622")) {//acá se usa el startwith para que cuando empiece en 622 se guarde en el contador así para los demas
                numGuaymas++;
            } else {// contador
                if (s.startsWith("662")) {
                    numHermosillo++;
                } else {
                    if (s.startsWith("664")) {
                        numTijuana++;
                    } else {
                        numDesconocido++;//aqui cae los que no empiezan ni con 622, 662 y 664 y los agrega en numeros desconocidos
                    }

                }

            }

        }
        System.out.println("total de numeros de guaymas: " + numGuaymas);//se imprimen los contadores 
        System.out.println("total de numeros de hermosillo: " + numHermosillo);
        System.out.println("total de numeros de tijuana: " + numTijuana);
        System.out.println("total de numeros desconocidos: " + numDesconocido);

        /*
        String numeros = lectorNumeros.next();
      while(numeros.startsWith(""))
         */
    }
    /*Scanner reader = new Scanner(System.in);
System.out.println("Escribe palabras que empiecen por '" + sInicio + "'");
sTexto = reader.next();

while(sTexto.startsWith("ca")) {
  System.out.println("Correcto... " + sTexto);
  contador++;
  System.out.println("Dime otra palabra...");
  sTexto = reader.next();
}
     */
}
