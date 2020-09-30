package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner en = new Scanner(System.in);

        int [] universo = new int[10];
        int [] conjuntoA = new int[5];
        int [] conjuntoB = new int[5];
        int [] union = new int[10];
        int [] interseccion = new int[10];
        int [] diferencia_b_menos_a = new int[conjuntoA.length + conjuntoB.length];
        int [] diferencia_a_menos_b = new int[conjuntoA.length * conjuntoB.length];
        
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
        for (int i = 0; i < conjuntoA.length; i++) {
            union[i] = conjuntoA[i];
        }

        int element = 5;
        for(int x = 0; x < conjuntoB.length; x++){
            int cont = 0;
            for (int j = 0; j < union.length; j++){
                if (union[j] == conjuntoB[x]) cont++;
            }

            if(cont == 0){
                union[element] = conjuntoB[x];
                element++;
            }
        }

        System.out.print("\n");
        System.out.print("Union { ");
        for(int iterar: union){
            System.out.print(iterar + " ");
        }
        System.out.print(" }");

        //Interseccion
        int a = 0;
        for(int i = 0; i < conjuntoA.length; i++){
            for (int j = 0; j < conjuntoB.length; j++){
                if (conjuntoA[i] == conjuntoB[j]){
                    interseccion[j] = conjuntoA[i];
                    a++;
                }
            }
        }

        System.out.println("\n");
        System.out.print("Conjunto interseccion: { ");
        for (int iterar: interseccion){
            System.out.print(iterar + " ");
        }
        System.out.print("}");

        //Diferencia B-A
        int r = 0;
        for (int i = 0; i < conjuntoA.length; i++){
            boolean n = false;
            for (int j = 0; j < conjuntoB.length; j++){
                if (conjuntoA[i] != conjuntoB[j]){
                    n = false;
                } else {
                    n = true;
                    j = conjuntoB.length;
                }
            }
            if (!n) {
                diferencia_b_menos_a[r] = conjuntoA[i];
                r++;
            }
        }

        System.out.println("\n");
        r = 0;
        boolean n = false;
        for (int i = 0; i < conjuntoB.length; i++){
            for (int j = 0; j < conjuntoA.length; j++){
                if (conjuntoB[i] != conjuntoA[j]){
                    n = false;
                } else {
                    n = true;
                    break;
                }
            }
            if(!n) {
                diferencia_b_menos_a[r] = conjuntoB[i];
                r++;
            }
        }
        System.out.println("Diferencia B-A :");
        System.out.print("{ ");
        for (int i = 0; i < r; i++){
            System.out.printf("%d, ", diferencia_b_menos_a[i]);
        }
        System.out.println("}");

        //Diferencia A-B
        int k = 0;
        boolean c = false;
        for (int i = 0; i < conjuntoA.length; i++){
            for (int j = 0; j < conjuntoB.length; j++){
                if (conjuntoA[i] != conjuntoB[j]){
                    c = false;
                } else {
                    c = true;
                    break;
                }
            }
            if (!c) {
                diferencia_a_menos_b[k] = conjuntoA[i];
                k++;
            }
        }
        System.out.println("\n");
        System.out.println("La diferencia de A-B: ");
        System.out.print("{");
        for (int i = 0; i < k; i++){
            System.out.printf("%d, ", diferencia_a_menos_b[i]);
        }
        System.out.println("}");
    }
}