package estructurada;
import java.util.Scanner;
public class RectanguloPrincipal {
	private static Scanner scanner; //= new Scanner(System.in); 
	public static void main(String[] args) {
		scanner  = new Scanner(System.in); 
		System.out.print("ingrea la base: ");
		double base = scanner.nextDouble();
		System.out.print("ingrasa la altura: ");
		double altura = scanner.nextDouble();
		System.out.println("el area del rectangulo es: "+base*altura);
	
	
	
	}

}
