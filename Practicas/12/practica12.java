import java.util.Scanner;
public class practica12 {
    public static void main(String[] args) {
        int dia, numero;
        double precio;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número segun el dia que sea: \n 1.- Lunes \n 2.- Martes \n 3.- Miercoles \n 4.- Jueves \n 5.- Viernes \n");
        dia = lector.nextInt();
        System.out.println("Introduce el precio del producto vendio: ");
        precio = lector.nextDouble();
        System.out.println("Introduce el número de productos vendidos: ");
        numero = lector.nextInt();
        lector.close();
        if (dia == 1){
            System.out.println("Los Lunes hay un 10% de descuento");
            System.out.println("El total a pagar es: " + (precio * numero) * 0.9);
        }
        if (dia == 2 || dia == 3){
            System.out.println("Los Martes y Miercoles hay un 5% de descuento");
            System.out.println("El total a pagar es: " + (precio * numero) * 0.95);
        }
        if (dia == 4 || dia ==5){
            System.out.println("Los Jueves y Viernes hay un 15% de descuento");
            System.out.println("El total a pagar es: " + (precio * numero) * 0.85);
        }
        else if (dia < 1 || dia > 5){
            System.out.println("El día introducido no es válido. Vuelva a ejecutar.");
        }
    }
}