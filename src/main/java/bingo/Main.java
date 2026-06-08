package bingo;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] bingo = new int[6][];

        for (int i = 0; i < bingo.length; i++) {
            bingo[i] = new int[(int) (Math.random() * 6) + 1];
        }

        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[i].length; j++) {
                bingo[i][j] = (int) (Math.random() * 50) + 1;
            }
        }

        while (true) {
            System.out.println("\n--- TU CARTÓN DE BINGO ---");

            for (int i = 0; i < bingo.length; i++) {
                for (int j = 0; j < bingo[i].length; j++) {

                    if (bingo[i][j] == -1) {
                        System.out.print("X\t");
                    } else {
                        System.out.print(bingo[i][j] + "\t");
                    }

                }
                System.out.println();
            }

            System.out.println("--------------------------");

            System.out.print("Ingrese el número a marcar (-1 para salir): ");
            int numero = sc.nextInt();

            if (numero == -1) {
                System.out.println("¡Gracias por jugar!");
                break;
            }

            boolean encontrado = false;

            for (int i = 0; i < bingo.length; i++) {
                for (int j = 0; j < bingo[i].length; j++) {

                    if (bingo[i][j] == numero) {
                        bingo[i][j] = -1;
                        encontrado = true;
                    }

                }
            }

            if (encontrado) {
                System.out.println("Número " + numero + " marcado.");
            } else {
                System.out.println("Ese número no está en el cartón.");
            }
        }

        sc.close();
    }
}


       /*  String[][] bingo = new String[5][5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        
        int[] numeros = new int[100];

        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        
        for (int i = 0; i < 100; i++) {
            int j = random.nextInt(100);

            int temp = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = temp;
        }

        int index = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = String.valueOf(numeros[index]);
                index++;
            }
        }


        while (true) {

            System.out.println("Pulsa ENTER para lanzar número o escribe 'exit' para salir:");
            String input = scanner.nextLi   ne();

            if (input.equals("exit")) {
                break;
            }

            int numeroLlamado = random.nextInt(100) + 1;

            System.out.println("Número llamado: " + numeroLlamado);

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {

                    if (bingo[i][j].equals(String.valueOf(numeroLlamado))) {
                        bingo[i][j] = "X";
                    }
                }

            }

            System.out.println("TABLA DE BINGO:");

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(bingo[i][j] + "\t");
                }
                System.out.println();
            }
        }

        scanner.close();*/


