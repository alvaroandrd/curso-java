import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		
		double valor = pi * raio * raio;
		System.out.printf("A=%.4f%n", valor);
		
		sc.close();
	}

}
