import java.util.Scanner;
public class Practica13 {
	public static void main(String[] args){
		int alimento, precio;
		int anchoColumna = 25;
		Scanner sc = new Scanner(System.in);
		System.out.println("Seleccione el alimento que desea ordenar: ");
		String[] menu = {"Hamburguesa Sencilla", "Hamburguesa con Queso", "Hamburguesa Espacial", "Papas Fritas", "Aros de Cebolla", "Soda"};
		String[] precios = {"$50", "$60", "$70", "$25", "$30", "$25"};
		System.out.println("Alimento" + " ".repeat(anchoColumna - 8) + "Precio");
		System.out.println("-".repeat(anchoColumna));
		for(int i = 0; i < menu.length; i++){
			System.out.print(menu[i] + " " + i);
			System.out.print(" ".repeat(anchoColumna - menu[i].length()));
			System.out.println(precios[i]);
		}
		alimento = sc.nextInt();
		System.out.println("Usted ha seleccionado: " + menu[alimento - 1]);
		System.out.println("El precio es: " + precios[alimento - 1]);
		System.out.println("Ingrese la cantidad de alimentos que desea ordenar: ");
		int cantidad = sc.nextInt();
		sc.close();
		switch (alimento) {
			case 1:
				precio = 50 * cantidad;
				System.out.println("El total a pagar es: " + precio);
				break;
			case 2:
				precio = 60 * cantidad;
				System.out.println("El total a pagar es: " + precio);
				break;
			case 3:
				precio = 70 * cantidad;
				System.out.println("El total a pagar es: " + precio);
				break;
			case 4:
				precio = 25 * cantidad;
				System.out.println("El total a pagar es: " + precio);
				break;
			case 5:
				precio = 30 * cantidad;
				System.out.println("El total a pagar es: " + precio);
				break;
			case 6:
				precio = 25 * cantidad;
				System.out.println("El total a pagar es: " + precio);
				break;
			default:
			System.out.println("Opción no válida");
				break;
		}
	}	
}
