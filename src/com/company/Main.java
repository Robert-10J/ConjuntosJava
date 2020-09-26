package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner en = new Scanner(System.in);

        int [] universo = new int[10];
        int [] conjuntoA = new int[5];
        int [] conjuntoB = new int[5];
        int [] union = new int[conjuntoA.length + conjuntoB.length];

        System.out.println("Ingrese los elementos para el universo");
        for (int i = 0; i < 10; i++){
            System.out.print("Ingrese elemento: ");
            universo[i] = en.nextInt();
        }

        System.out.println("\nIngrese los elementos para el conjunto A");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento: ");
            conjuntoA[i] = en.nextInt();
        }

        System.out.println("\nIngrese los elementos para el conjunto B");
        for (int i = 0; i < 5; i++){
            System.out.print("Elemento: ");
            conjuntoB[i] = en.nextInt();
        }

        /*int i= 0;
        for ( i = 0; i < conjuntoA.length; i++){
            union[i] = conjuntoA[i];
        }

        for (int j = 0; j < conjuntoB.length; j++){
            union[i] = conjuntoB[j];
            i++;
        }*/

        for(int i = 0; i < conjuntoA.length; i++){
            for (int j = 0; j < conjuntoB.length; j++){
                if(conjuntoA[i] == conjuntoB[i]){
                    System.out.println("Los elementos" + conjuntoA[i] + "No se agregan a la union");
                } else {

                }
            }
        }
        /*System.out.println("La union de los conjuntos es: ");
        for (int recorrerU: union){
            System.out.print(recorrerU + " ");
        }*/

    }
}
