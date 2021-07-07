
public class Ejercicio1 {

	public static void main(String[] args) {
		//2 variables i hacer suma, resta, multiplicación, división i el resto
		
		//Declaramos i assignamos el valor a las variables
		int num1 = 20;
		int num2 = 6;
		int suma, resta, mult, div, resto;
		
		//Hacemos los calculos
		suma = num1 + num2;
		resta = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		resto = num1 % num2;
		
		//Mostramos los resultados de las operaciones
		System.out.println("Num 1 = " + num1 + " Num 2 = " + num2);
		System.out.println("SUMA = " + suma);
		System.out.println("RESTA = " + resta);
		System.out.println("MULTIPLICACIÓN = " + mult);
		System.out.println("DIVISIÓN = " + div);
		System.out.println("RESTO = " + resto);
	}

}
