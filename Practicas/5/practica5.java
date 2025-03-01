import java.util.Scanner;
public class practica5{
	public static void main(String[] args){
		double n1, n2;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		n1 = lector.nextDouble();
		System.out.println("Introduce el segundo numero: ");
		n2 = lector.nextDouble();

		System.out.println("La suma de ambos numeros es " + (n1+n2) + ".");
		System.out.println("La resta es " + (n1-n2) + ".");
		System.out.println("La multiplicacion es " + (n1*n2) + ".");
		if (n2 != 0){
			System.out.println("El cociente es " + (n1/n2) + ".");
		}
		else{
			System.out.println("No se puede efectuar la division");
		}
	}	
}
