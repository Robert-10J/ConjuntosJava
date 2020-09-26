package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner en = new Scanner(System.in);

        int [] universo = new int[10];
        int [] conjuntoA = new int[5];
        int [] conjuntoB = new int[5];
        int [] union = new int[conjuntoA.length + conjuntoB.length];
        int [] interseccion = new int[conjuntoA.length + conjuntoB.length];
        int [] diferencia = new int[conjuntoA.length + conjuntoB.length];

        System.out.println("Ingrese los elementos para el universo");
        for (int i = 0; i < 10; i++){
            System.out.print("Ingrese elemento: ");
            universo[i] = en.nextInt();
        }
        for (int iteUni: universo){
            System.out.print(iteUni + " ");
        }
        System.out.println("\n");
        System.out.println("\nIngrese los elementos para el conjunto A");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento: ");
            conjuntoA[i] = en.nextInt();
        }

        for (int iteA: conjuntoA) {
            System.out.print( iteA + " ");
        }
        System.out.println("\n");
        System.out.println("\nIngrese los elementos para el conjunto B");
        for (int i = 0; i < 5; i++){
            System.out.print("Elemento: ");
            conjuntoB[i] = en.nextInt();
        }

        for (int iteB: conjuntoB){
            System.out.print(iteB + " ");
        }

        //AuB conjuntos
        for (int i = 0; i < conjuntoA.length; i++){
            union[i] = conjuntoA[i];
        }

        int pos = 5;
        for(int x = 0; x < conjuntoB.length; x++){
            int cont = 0;
            for (int j = 0; j < union.length; j++){
                if (union[j] == conjuntoB[x]) cont++;
            }

            if(cont == 0){
                union[pos] = conjuntoB[x];
            }
        }

        System.out.print("\n");
        System.out.print("Union { ");
        for(int iterar: union){
            System.out.print(iterar + " ");
        }
        System.out.print(" }");
    }
}
