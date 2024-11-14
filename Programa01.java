package Programas;
import java.util.Scanner;
public class Programa01 {
public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double im,oi,gm;

        // Solicitar ingreso de datos al usuario
        System.out.print("Ingresar ingreso mensual:");
        im=lectura.nextDouble();
        System.out.print("Ingrese otro ingreso: ");
        oi=lectura.nextDouble();
        System.out.print("Ingrese gasto mensual: ");
        gm=lectura.nextDouble();
        
        // Crear un objeto Empleado con los datos ingresados
        Empleado objempleado = new Empleado();
        objempleado.setIngresoMensual(im);
        objempleado.setOtrosIngresos(oi);
        objempleado.setGastosMensuales(gm);
        //salida de datos
        System.out.println("El ahorrro Mensual es:"+objempleado.getAhorroMensual());
        System.out.println("Otro ingreso es:"+objempleado.getAhorroSemestral());
        System.out.println("El gasto mensual es:"+objempleado.getAhorroAnual());
    }
}