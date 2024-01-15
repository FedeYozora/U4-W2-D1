package it.epicode.Es1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        System.out.println("Array iniziale:");
        stampaArray(array);

        while (true) {
            System.out.print("Inserisci un numero (0 per terminare): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            System.out.print("Inserisci una posizione (da 0 a 4): ");
            int posizione = scanner.nextInt();

            try {
                array[posizione] = numero;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore: posizione non valida. Riprova.");
                continue;
            }

            System.out.println("Nuovo stato dell'array:");
            stampaArray(array);
        }

        System.out.println("Programma terminato.");
    }

    private static void stampaArray(int[] array) {
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
