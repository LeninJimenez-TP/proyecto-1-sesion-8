
package programa;

import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
        // declarar variables
        double sueldo,ts,ps;
        int ns,i;
        Scanner lectura = new Scanner (System.in);
        //entrada
        System.out.print("Ingresar cantidad de sueldos:");
        ns=lectura.nextInt();
        ts=0.0;
        //proceso
        for(i=1;i<=ns;i++){
            System.out.print("Ingresar sueldo"+i+":");
            sueldo=lectura.nextDouble();
            ts+=sueldo;
        }
        ps=ts/ns;
        //salida de datos
        System.out.println("El total de sueldo es:"+ts);
        System.out.println("El promedio de sueldo es:"+ps);
        
    }
}
