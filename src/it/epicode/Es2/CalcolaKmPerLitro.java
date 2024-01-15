package it.epicode.Es2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class CalcolaKmPerLitro {
    private static final Logger logger = LoggerFactory.getLogger(CalcolaKmPerLitro.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci il numero di km percorsi: ");
            double kmPercorsi = scanner.nextDouble();

            System.out.print("Inserisci i litri di carburante consumati: ");
            double litriConsumati = scanner.nextDouble();

            double kmPerLitro = calcolaKmPerLitro(kmPercorsi, litriConsumati);
            System.out.println("Il numero di km per litro percorsi è: " + kmPerLitro);
        } catch (ArithmeticException e) {
            logger.error("Errore: divisione per zero!");
        } catch (Exception e) {
            logger.error("Errore: " + e.getMessage());
        }
    }

    public static double calcolaKmPerLitro(double kmPercorsi, double litriConsumati) {
        if (litriConsumati == 0) {
            throw new ArithmeticException("Impossibile dividere per zero!");
        }

        return kmPercorsi / litriConsumati;
    }
}