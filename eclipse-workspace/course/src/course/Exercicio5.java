package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            System.out.println("Student #:"+i);	
            float n1 = sc.nextFloat();
            float n2 = sc.nextFloat();
            float n3 = sc.nextFloat();
            float score = (n1+n2+n3);
            System.out.printf("Score: %.2f%n", score);
        }
        sc.close();
	}

}
