package programa;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        // Declarar variables
        int mul3 = 0;
        int mul5 = 0;
        int valor, f;
        Scanner lectura = new Scanner(System.in);
        
        // Proceso de datos
        for (f = 1; f <= 10; f++) {
            System.out.print("Ingrese un numero:");
            valor = lectura.nextInt();
            
            if (valor % 3 == 0) {
                mul3++;
            } 
            if (valor % 5 == 0) {
                mul5++;
            }
        }
        
        // Salida de datos
        System.out.println("Cantidad de numeros ingresados multiplos de 3: " + mul3);
        System.out.println("Cantidad de numeros ingresados multiplos de 5: " + mul5);
    }
}