import java.util.Scanner;
/**
 * Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular el valor del predio de un bien inmueble. 
 * Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, cédula del cliente).
 * En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio y el número de kilowatios del mes. Y se genera en pantalla 
 * el siguiente reporte: Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10
 * En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener el valor del predio se saca el 2% del valor del inmueble. 
 * Y se genera el siguiente reporte:
 * Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que pagar de predio $ 600.
 * En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz; 2 se llama al procedimiento calcularPredio. Los datos que 
 * se necesita en cada procedimiento se los debe ingresar por teclado.
 * @author Luis
 */
public class Ejercicio4_Planilla {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numkw, cedula, metodo;
        double preciokw, costoInmueble;
        String nombre;
        System.out.print("Ingrese su nombre: ");
        nombre = tcl.nextLine();
        System.out.print("Ingrese su RUC o numero de cedula: ");
        cedula = tcl.nextInt();
        System.out.print("Seleccione que proceso desea realizar(1.Planilla de luz o 2.Predio):");
        metodo = tcl.nextInt();
        if (metodo == 1){
            System.out.print("Ingrese la cantidad de kilowatios consumidos en el mes: ");
            numkw = tcl.nextInt();
            System.out.print("Ingrese el precio del kilowatio: ");
            preciokw = tcl.nextDouble();
            System.out.print("Cliente: " + nombre + ", No.cedula " + cedula + ", su valor a cancelar: " + valorLuz(numkw, preciokw) + "$");
        }else if(metodo == 2){
            System.out.print("Dime el precio del inmueble: ");
            costoInmueble = tcl.nextDouble();
            System.out.print("Cliente: " + nombre + ", No. cedula " + cedula + " con un inmueble de valor: " + costoInmueble + " debe cancelar: " + predio(costoInmueble) + "$");
        }System.out.println("");
    }
    public static double valorLuz(int numkw, double preciokw) {
        return numkw * preciokw;
    }
    public static double predio(double costoInmueble){
        return costoInmueble * 0.02;
    }
}
/***
 * run:
 * Ingrese su nombre: Jorge Luis Quito 
 * Ingrese su RUC o numero de cedula: 1106050550
 * Seleccione que proceso desea realizar(1.Planilla de luz o 2.Predio):1
 * Ingrese la cantidad de kilowatios consumidos en el mes: 76
 * Ingrese el precio del kilowatio: 0,75
 * Cliente: Jorge Luis Quito , No.cedula 1106050550, su valor a cancelar: 57.0$
 * BUILD SUCCESSFUL (total time: 21 seconds)
 */