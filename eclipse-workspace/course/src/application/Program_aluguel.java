package application;

import java.text.ParseException;
import java.util.Scanner;
import entities.Alocacao;

public class Program_aluguel {

	  public static void main(String[] args) throws ParseException{
		     Scanner sc = new Scanner(System.in);
		     Alocacao[] vect= new Alocacao[10];
		
		     System.out.println("How many rooms will be rented?");
		     int n = sc.nextInt();
		     
		     for(int i = 1;i<=n;i++) {
		    	  sc.nextLine();
		    	  System.out.println("Rent #"+i+":");
			      System.out.println("Name:");
			      String name = sc.nextLine();
			      sc.nextLine();
			      System.out.println("Email:");
			      String email=sc.nextLine();
			      sc.nextLine();
			      System.out.println("Room:");
			      int room = sc.nextInt();
			      vect[room] = new Alocacao(name,email);
			 }
		     System.out.println();
		     System.out.println("Busy Rooms:");
		     for(int i=0;i<10;i++) {
		    	  if(vect[i] != null) {
		    		   System.out.println(i+":"+vect[i]);
		    	  }
		     }
	}

}
