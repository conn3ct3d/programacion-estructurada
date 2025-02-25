import java.util.Scanner; 
public class practica4 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa la primera calificacion: ");
		double primeraCalificacion = scanner.nextDouble();
		System.out.print("Ingresa la segunda calificacion: ");
		double segundaCalificacion = scanner.nextDouble();
		double resultado = (primeraCalificacion+segundaCalificacion)/2;
		System.out.println("El promedio del estudiante es: " + resultado);
		scanner.close();
	}
}
