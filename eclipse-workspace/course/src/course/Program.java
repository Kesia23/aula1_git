package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Full Name:");
		String name = sc.nextLine();//Kesia Silva
		System.out.println(name);
		System.out.println("How many bedrooms are there in your house?");
		int n1 = sc.nextInt();//3
		System.out.println(n1);
		System.out.println("Enter product price:");
		double n2 = sc.nextDouble();
		System.out.println(n2);
		System.out.println("Enter your last name, age and height (same line):");
		String name2 = sc.next();
		int age = sc.nextInt();
		Double height = sc.nextDouble();
		System.out.println(name2);
		System.out.println(age);
		System.out.println(height);
		sc.close();
	}
	   

}
