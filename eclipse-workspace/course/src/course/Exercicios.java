package course;

import java.util.Scanner;

public class Exercicios {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if(n1>n2 && n1>n3) {
			System.out.printf("Higher:%d\n",n1);	
		}
		else if(n2>n1 && n2>n3) {
			System.out.printf("Higher:%d\n",n2);	
		}
		else if(n3>n1 && n3>n2) {
			System.out.printf("Higher:%d\n",n3);	
		}
		else if((n1==n2 && n1>n3)  || (n1==n3 && n1>n2)){
			System.out.printf("Higher:%d",n1);
		}
		else if((n2==n1 && n2>n3)  || (n2==n3 && n2>n1)){
			System.out.printf("Higher:%d",n2);
		}
		else if((n3==n1 && n3>n2)  || (n3==n2 && n3>n1)){
			System.out.printf("Higher:%d",n3);
		}
		sc.close();
	}

}
