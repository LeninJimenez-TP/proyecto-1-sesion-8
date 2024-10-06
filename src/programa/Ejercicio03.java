package programa;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        // Declarar variables
        int cantidad = 0;
        int n, f, valor;
        Scanner lectura = new Scanner(System.in);
        
        // Entrada
        System.out.print("Cuantos numeros ingresara: ");
        n = lectura.nextInt();
        
        // Proceso
        for (f = 1; f <= n; f++) {
            System.out.print("Ingrese el numero: ");
            valor = lectura.nextInt();
            
            if (valor >= 1000) {
                cantidad++;
            }
        }
        
        // Salida de datos
        System.out.println("La cantidad de numeros ingresados mayores o iguales a 1000 son: " +cantidad);
    }
}
