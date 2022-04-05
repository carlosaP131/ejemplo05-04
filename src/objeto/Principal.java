package objeto;

import java.util.Scanner;

public class Principal {
	private static Scanner scanner; 
	private static Rectangulo area;
	public static void main(String[] args) {
		area = new Rectangulo();
		scanner  = new Scanner(System.in); 
		System.out.print("ingrea la base: ");
		 area.setBase(scanner.nextDouble()); 
		System.out.print("ingrasa la altura: ");
		area.setAltura(scanner.nextDouble()); 
	     System.out.println("el area es: "+area.getArea());
	      
	}

}
