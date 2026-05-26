package bingo;

import java.util.Random;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

        String[][] bingo = new String[5][5];
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
            String input = scanner.nextLine();

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

        scanner.close();
    }
}
