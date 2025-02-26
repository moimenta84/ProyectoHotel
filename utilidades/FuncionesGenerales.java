package SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.utilidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FuncionesGenerales {
    private static Scanner scan = new Scanner(System.in);

    public static int scanerNum() {
        int num;
        while (true) {
            try {
                num = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Solo número enteros");
            }
        }
        return num;
    }

    public static String scanerString() {
        return scan.nextLine();
    }

    public static int scannerLimArray(int limit) {

        int num;
        while (true) {
            System.out.print("Introduce un número entre 1 y " + limit + ": ");
            num = scanerNum();
            num--; // Ajustar para índice basado en 0
            if (num >= 0 && num < limit) {
                return num;
            } else {
                System.out.println("Número fuera de rango. Inténtalo de nuevo.");
            }
        }
    }

    public static LocalDateTime obtenerFechaHora() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        LocalDateTime fechaHoraIntroducida = null;

        while (true) {
            try {
                System.out.println("Introduce el año (YYYY):");
                int año = scanerNum();

                System.out.println("Introduce el mes (MM):");
                int mes = scanerNum();

                System.out.println("Introduce el día (DD):");
                int dia = scanerNum();

                System.out.println("Introduce la hora (HH):");
                int hora = scanerNum();

                System.out.println("Introduce los minutos (MM):");
                int minutos = scanerNum();

                System.out.println("Introduce los segundos (SS):");
                int segundos = scanerNum();

                fechaHoraIntroducida = LocalDateTime.of(año, mes, dia, hora, minutos, segundos);

                if (fechaHoraIntroducida.isBefore(fechaHoraActual)) {
                    System.out.println("La fecha y hora introducidas son anteriores al momento actual. Por favor, introduce una fecha y hora válidas.");
                } else {
                    break;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Formato de fecha y hora no válido. Por favor, inténtalo de nuevo.");
                scan.nextLine(); // Consumir la línea para evitar un bucle infinito
            }
        }

        return fechaHoraIntroducida;
    }

}
