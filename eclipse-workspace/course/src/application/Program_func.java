package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program_func {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	Funcionario funcionario = new Funcionario();
	//vou mandar o nome, salario e taxa para a Classe Funcionario, ela tera uma fun��o que calcular� e mostrar� o nome e sal�rio liquido
	System.out.println("Insira o nome, salario bruto e taxa do funcion�rio");
    String name = sc.nextLine();
    double salary = sc.nextDouble();
    double taxa = sc.nextDouble();
    //System.out.printf("Nome: %s, Salario Bruto: %.2f, Taxa: %.2f", name,salary,taxa);
    //chamar funcao NetSalary
    funcionario.NetSalary(name,salary,taxa);
    //porcentagem
    System.out.println("Qual a porcentagem dada?");
    double perc = sc.nextDouble();
    //chamar funcao porcentagem
    funcionario.Porcentagem(name, salary, perc,taxa);
	}

}
