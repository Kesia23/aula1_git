package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program_Emp {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Quantos funcionario?");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Employee #"+i);
			System.out.println("Id:");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.println("Name:");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.println("Salary:");
			Double salary = sc.nextDouble();
			Employee employee = new Employee(id,name,salary);
			list.add(i, employee);
		}	
			System.out.println("Enter the employee id that will have salary increase :");
			int acharId= sc.nextInt();
			System.out.println("Enter the percentage:");
            double per = sc.nextDouble();
       
            System.out.println("Index of: "+list.indexOf(acharId));
            }//vou encontrar o funionario e depois aplico a porcentagem
            //pegar a posicao do elemento e com a posicao alterar
		
		
		//for(Employee x: list) {
		//	System.out.println(list);
		//}

	}
	//id nao pode repetir



