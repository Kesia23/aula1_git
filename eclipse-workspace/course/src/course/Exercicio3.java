package course;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one number:");
		int n = sc.nextInt();
		while(n!= 0) {
			int quadrado = (n*n);//calcular a raiz do que ja foi digitado
		    System.out.printf("%d\n",quadrado);
		    System.out.println("Enter one number:");
		    n = sc.nextInt();
		}

	}

	

}
