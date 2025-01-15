import java.util.Scanner; 
/**
 * Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio cualitativo de los parámetros. Si el promedio es: De 0 a 5 el promedio cualitativo 
 * es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 el promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente. A la función se la debe llamar desde un método 
 * principal. Los parámetros necesarios para llamar a la función, deben ser ingresados solicitados al usuario.
 * @author Luis
 */
public class Ejercicio3_Promedio {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double numeros[] = new double[4];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el parametro " + (i + 1) + ": ");
            numeros[i] = tcl.nextDouble();
        }
        promediocualitativo(numeros);
        valoracionPromedio(0);
    }
    public static void promediocualitativo(double numeros[]) {
        double prom = 0;
        for (int i = 0; i < numeros.length; i++) {
            prom += numeros[i];
        }
        prom = prom / numeros.length;
        System.out.println("El promedio es: " + prom);
    }
    public static void valoracionPromedio(double prom) {
        if (prom >= 0 && prom <= 5) {
            System.out.println("El promedio es regular ");
        } else if (prom >= 5.1 && prom <= 9) {
            System.out.println("El promedio es muy bueno");
        } else if (prom >= 9.1 && prom <= 10) {
            System.out.println("El promedio es sobresaliente");
        } else {
            System.out.println("Valor invalido ");
        }
    }
}
/***
 * run:
 * Ingrese el parametro 1: 4
 * Ingrese el parametro 2: 9
 * Ingrese el parametro 3: 9
 * Ingrese el parametro 4: 8
 * El promedio es: 7.5
 * El promedio es regular 
 * BUILD SUCCESSFUL (total time: 7 seconds)
 */