package task2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class BMIClient {
    public static void main(String[] args) {
        //hardcoded gewicht und groesse
        double mass = 80.0;
        double height = 1.80;

        System.out.println("BMI Client gestartet ... ");

        //neuen bmi initialisieren
        BMI bmi = new BMI(mass, height);

        //erster Schritt berechne bmi
        CompletableFuture<Double> bmiBerechnung = CompletableFuture.supplyAsync(() -> bmi.calcBMI());
        //zweiter Schritt berichtszustand bestimmen mit bmi ergebnis aus zweitem Teil.
        CompletableFuture<String> gewichtszustandBestimmung = bmiBerechnung.thenApply(bmi::bestimmeGewichtsZustand);
        //letzter Schritt Ergebnis ausgeben.
        gewichtszustandBestimmung.thenAccept(result -> {
            System.out.println("BMI Analyse abgeschlossen: ");
            System.out.println("Der Gewischtszustand ist: " + result);
        });

        try {
            gewichtszustandBestimmung.get();// hole gewichtszustand
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
