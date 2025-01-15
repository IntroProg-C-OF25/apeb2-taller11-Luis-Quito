import java.util.Scanner;
/**
 * Generar las funciones/métodos que devuelvan las suma, resta y multiplicación de un arreglo bidimensional cuadrado; mismo que se lo recibe como parámetro.
 * @author Luis
 */
public class Ejercicio5_Calculadora {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int extension, tipo;
        System.out.print("Seleccione el tipo de operacion a realizar: (1. Suma, 2. Resta, 3. Multiplicacion): ");
        tipo = tcl.nextInt();
        if (tipo > 0 && tipo <= 3) {
            System.out.print("Ingrese las filas de la matriz: ");
            extension = tcl.nextInt();
            int matriz1[][] = new int[extension][extension];
            int matriz2[][] = new int[extension][extension];
            int matriz3[][] = new int[extension][extension];
            for (int i = 0; i < (matriz1.length); i++) {
                for (int j = 0; j < matriz1[0].length; j++) {
                    System.out.print("Valores de la matriz 1: ");
                    matriz1[i][j] = tcl.nextInt();
                }
            }
            for (int i = 0; i < (matriz1.length); i++) {
                for (int j = 0; j < matriz1[0].length; j++) {
                    System.out.print("Valores de la matriz 2: ");
                    matriz2[i][j] = tcl.nextInt();
                }
            }
            operaciones(matriz1, matriz2, matriz3, tipo);
        }  
    }
    public static void operaciones(int matriz1[][], int matriz2[][], int matriz3[][], int tipo) {
        switch (tipo) {
            case 1:
                System.out.println("Respues de la suma es: ");
                for (int i = 0; i < matriz1.length; i++) {
                    for (int j = 0; j < matriz1[0].length; j++) {
                        matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
                        System.out.print("[" + matriz3[i][j] + "]" + " ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("Respuesta de la resta es: ");
                for (int i = 0; i < matriz1.length; i++) {
                    for (int j = 0; j < matriz1[0].length; j++) {
                        matriz3[i][j] = matriz1[i][j] - matriz2[i][j];
                        System.out.print("[" + matriz3[i][j] + "]" + " ");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for (int i = 0; i < matriz1.length; i++) {
                    for (int j = 0; j < matriz1[0].length; j++) {
                        for (int k = 0; k < matriz1[0].length; k++) {
                            matriz3[i][j] = matriz3[i][j] + (matriz1[i][k] * matriz2[k][j]);
                        }
                        System.out.print("["+matriz3[i][j]+"]" + " ");
                    }
                    System.out.println("");
                }
                break;
        }
    }
}
/***
 * run:
 * Seleccione el tipo de operacion a realizar: (1. Suma, 2. Resta, 3. Multiplicacion): 1
 * Ingrese las filas de la matriz: 2
 * Valores de la matriz 1: 5
 * Valores de la matriz 1: 8
 * Valores de la matriz 1: 9
 * Valores de la matriz 1: 4
 * Valores de la matriz 2: 2
 * Valores de la matriz 2: 3
 * Valores de la matriz 2: 5
 * Valores de la matriz 2: 8
 * Respues de la suma es: 
 * [7] [11] 
 * [14] [12] 
 * BUILD SUCCESSFUL (total time: 38 seconds
 */