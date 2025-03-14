import java.util.Scanner;

public class practica7 {
    public static void main(String[] args) {
        // Declaración de variables al comienzo
        Scanner scanner;
        float precioPorUnidad, porcentajeIVA, precioVenta, precioTotalSinIVA, montoIVA;
        int cantidadProductos;

        scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio por unidad (sin IVA): ");
        precioPorUnidad = scanner.nextFloat();

        System.out.print("Ingrese la cantidad de productos vendidos: ");
        cantidadProductos = scanner.nextInt();

        System.out.print("Ingrese el porcentaje de IVA aplicado: ");
        porcentajeIVA = scanner.nextFloat();
        precioTotalSinIVA = precioPorUnidad * cantidadProductos;
        montoIVA = (porcentajeIVA / 100) * precioTotalSinIVA;
        precioVenta = precioTotalSinIVA + montoIVA;

        System.out.println("El precio de venta total con IVA es: $" + precioVenta);
        scanner.close();
    }
}
