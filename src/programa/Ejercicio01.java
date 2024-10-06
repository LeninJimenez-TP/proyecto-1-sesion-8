package programa;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        // Declarar variables
        int aprobados = 0;
        int reprobados = 0;
        int f, nota;
        Scanner lectura = new Scanner(System.in);
        // Ingreso de datos
        for (f = 1; f <= 10; f++) {
            System.out.print("Ingrese la nota:");
            nota = lectura.nextInt();
            
            if (nota >= 7) {
                aprobados++;
            } else {
                reprobados++;
            }
        }
        // Salida de datos
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de reprobados: " + reprobados);
    }
}