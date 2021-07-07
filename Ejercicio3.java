
public class Ejercicio3 {

	public static void main(String[] args) {
		//Declaración valiables i asignación de los valores
		int x = 26 , y = 10; 
		double n = 35.5, m = 15.5;
		
		//Mostramos los calculos
		System.out.println("Calculos con X y Y");
		System.out.println("SUMA " + (x + y));
		System.out.println("RESTA " + (x - y));
		System.out.println("MULTIPLICACIÓN " + (x * y));
		System.out.println("DIVISIÓN  " + (x / y));
		System.out.println("RESTO " + (x % y));
		System.out.println("--------------------");
		System.out.println("Calculos con N y M");
		System.out.println("SUMA " + (n + m));
		System.out.println("RESTA " + (n - m));
		System.out.println("MULTIPLICACIÓN " + (n * m));
		System.out.println("DIVISIÓN  " + (n / m));
		System.out.println("RESTO " + (n % m));
		//El doble de las variables
		System.out.println("--------------------");
		System.out.println("Doble de las variables");
		System.out.println(x * 2);
		System.out.println(y * 2);
		System.out.println(n * 2);
		System.out.println(m * 2);
		System.out.println("--------------------");
		System.out.println("Suma total = " + (x + y + n + m));
		System.out.println("Producto total = " + (x * y * n * m));
	}

}
