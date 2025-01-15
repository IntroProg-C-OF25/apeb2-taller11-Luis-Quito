import java.util.Scanner; 
/**
 * Generar una solución que implemente 3 procedimientos. Que permitan calcular el área de un cuadrado, área de un triángulo y área de un rectángulo. Cada procedimiento/función 
 * debe recibir los datos necesarios y generar el valor correspondiente. Se debe invocar a los procedimientos desde un método principal; Si el usuario ingresa 1 se llama al 
 * procedimiento obtenerAreaCuadrado; 2 se llama al procedimiento obtenerAreaTriangulo; 3 se llama al procedimiento obtenerAreaCuadrado.
 * El área del cuadrado es igual a lado x lado x lado x lado
 * El área del triángulo es igual a (base x altura)/2
 * El área del rectángulo es igual a base x altura
 * @author Luis
 */
public class Ejercicio2_Areas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double lado = 0, base = 0, altura = 0; 
        int tipoArea = 0;
        System.out.println("Seleccione que area de la figura quiere (1.Cuadrado, 2.Triangulo, 3. Rectangulo)");
        tipoArea = tcl.nextInt();
        switch (tipoArea) {
            case 1:{
                System.out.println("Dime el lado del cuadrado: ");
                lado = tcl.nextDouble();
                System.out.println("El area del cuadrado es: " + Areacuadrado(lado));
                break;
            } 
            case 2:{
                System.out.println("Dime la base del triangulo: ");
                base = tcl.nextDouble();
                System.out.println("Dime la altura del triangulo: ");
                altura = tcl.nextDouble();
                System.out.print("El area del triangulo es: " + Areatriangulo(base, altura));
                break;
            }
            case 3:{
                System.out.println("Dime la base del rectangulo: ");
                base = tcl.nextDouble();
                System.out.println("Dime la altura del rectangulo: ");
                altura = tcl.nextDouble();
                System.out.println("El area del rectangulo es: " + Arearectangulo(base, altura));
            }    
                break;
            default:
                throw new AssertionError();
        }
    }
    public static double Areacuadrado(double lado){
        return lado * lado;
    }
    public static double Areatriangulo(double base,  double altura){
        return (base * altura)/2;
    }
    public static double Arearectangulo(double base,  double altura){
        return (base * altura);
    }
}
/***
 * run:
 * Seleccione que area de la figura quiere (1.Cuadrado, 2.Triangulo, 3. Rectangulo)
 * 2
 * Dime la base del triangulo: 
 * 6,7
 * Dime la altura del triangulo: 
 * 8,3
 * El area del triangulo es: 27.805000000000003
 * BUILD SUCCESSFUL (total time: 17 seconds)
 */