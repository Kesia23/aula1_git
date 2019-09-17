package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Dolar;
public class Program_dollar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Dolar dolar = new Dolar();

		System.out.println("What is the dollar price?");
        double price = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
		double valor = sc.nextDouble();
        double result = dolar.dollarToReal(price,valor);
        System.out.printf("Amount to be paid in reais = %.2f",result);
	}

}
