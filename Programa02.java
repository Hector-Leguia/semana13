package Programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
        //declarar variables
        double cp1,cp2,cp3,cp4;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar Compra 1:");
        cp1=lectura.nextDouble();
        System.out.print("Ingresar Compra 2:");
        cp2=lectura.nextDouble();
        System.out.print("Ingresar Compra 3:");
        cp3=lectura.nextDouble();
        System.out.print("Ingresar Compra 4:");
        cp4=lectura.nextDouble();
        
        RegistroCompra objregcompra = new RegistroCompra();
        objregcompra.setCompra1(cp1);
        objregcompra.setCompra2(cp2);
        objregcompra.setCompra3(cp3);
        objregcompra.setCompra4(cp4);
        //Salida de datos
        System.out.println("El total de comprass es:"+objregcompra.gettotal());
        System.out.println("El promedio de coompras es:"+objregcompra.getpromedio());
        System.out.println("La venta mayor es:"+objregcompra.getmayor());
        System.out.println("La venta menor es:"+objregcompra.getmenor());
    }
}
