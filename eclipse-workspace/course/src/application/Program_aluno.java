package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program_aluno {


	public static void main(String[] args) {
		String name;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Insira o nome do aluno \n");
		name = sc.nextLine();
		//ler1numero de cada vez
		System.out.printf("Insira a 1º notas \n");
		double n1 = sc.nextDouble();
		System.out.printf("Insira a 2º notas \n");
		double n2 = sc.nextDouble();
		System.out.printf("Insira a 3º notas \n");
		double n3 = sc.nextDouble();
		double nota = aluno.notaFinal(n1,n2,n3);
		System.out.printf("Nota Final: %.2f \n", nota);
		aluno.result();
	}


}
