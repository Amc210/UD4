
public class Ejercicio5 {

	public static void main(String[] args) {
		//Declaración variables i asignación del 1er valor
		int A = 5, B = 10, C = 15, D = 20, aux= 0;
		
		//Asignamos el valor de una variable a la otra
		aux = B;
		B = C;
		C = A;
		A = D;
		D = aux;
		
		//Mostramos los nuevos valores
		System.out.println("B = " + B);		
		System.out.println("C = " + C);		
		System.out.println("A = " + A);		
		System.out.println("D = " + D);
		
	}

}
