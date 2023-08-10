import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		int soma = number1 + number2;
		System.out.printf("Soma = %d%n", soma);
		
		sc.close();
	}

}
