import java.util.Scanner;
/**
 * Generar los procedimientos y/o funciones que impriman los valor pares, impares y el promedio de un arreglo bidimensional. El (los) procedimiento(s) o método(s) 
 * deben ser invocados desde el método principal (quien es el único responsable de gestionar las entradas/salidas); además el método debe recibir como parámetro 
 * un arreglo bidimensional.
 * @author Luis 
 */
public class Ejercicio1_ParesImpares {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limFil = 0, limCol = 0; 
        System.out.print("Ingrese el limite de las filas y columnas: ");
        limFil = tcl.nextInt();
        limCol = tcl.nextInt();
        int matriz[][] = new int[limFil][limCol]; 
        generarMatriz(matriz);
        System.out.println("Matriz generada: ");
        presentarMatriz(matriz);
        presentarParImparMatriz(matriz);
        presentarPromedio(matriz);
    }
    public static void generarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    public static void presentarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void presentarParImparMatriz(int matriz[][]){
        System.out.println("Elementos pares de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j]%2 == 0) ? matriz[i][j] + (" ") : "");
            }
            System.out.println("");
        }
        System.out.println("Elementos impares de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j]%2 != 0) ? matriz[i][j] + (" ") : "");
            }
            System.out.println("");
        }
    }
    public static void presentarPromedio(int matriz[][]){
        int sumaMatriz = 0, promMatriz = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaMatriz += matriz[i][j];
            }
        }
        promMatriz = sumaMatriz / (matriz.length * matriz[0].length);
        System.out.println("El promedio de la matriz: " + promMatriz);
    }
}
/***
 * run:
 * Ingrese el limite de las filas y columnas: 3 3
 * Matriz generada: 
 * 1 3 1 
 * 0 2 2 
 * 5 9 7 
 * Elementos pares de la matriz
 * 0 2 2 
 * Elementos impares de la matriz
 * 1 3 1 
 * 5 9 7 
 * El promedio de la matriz: 3
 * BUILD SUCCESSFUL (total time: 5 seconds)
 */