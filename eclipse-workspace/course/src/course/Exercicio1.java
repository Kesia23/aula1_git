package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers:");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double result = (n1+n2+n3);
		System.out.printf("%.2f\n",result);
		if(result<60.00) {
			System.out.println("Failed");
		}
	}
}


