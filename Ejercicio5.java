
public class Ejercicio5 {

	public static void main(String[] args) {
		//Declaración variables i asignación del 1er valor
		int A = 5, B = 10, C = 15, D = 20;
		
		//Asignamos el valor de una variable a la otra
		B = C;
		C = A;
		A = D;
		D = B;
		
		//Mostramos los nuevos valores
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		System.out.println("C = " + C);
		System.out.println("D = " + D);
	}

}
