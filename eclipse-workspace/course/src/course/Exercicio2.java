package course;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int i = n1;
		int total = 0;
		while (i<=n2) {
			if((i%2) != 0) {
				total = total+i;
			}
				i++;
		}
		System.out.printf("%d", total);

	}

}
