package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program_Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Account conta;
   
        System.out.println("Enter account number:");
        int account = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder:");
        String holder = sc.nextLine();
        System.out.println("Is there na initial deposit (y/n)?");
        char response = sc.next().charAt(0);
        if(response == 'y') {
        	System.out.println("Enter initial deposit value:");
        	double initialDeposit = sc.nextDouble();
        	conta = new Account(account, holder, initialDeposit);
        }
        //sobrecarga
        else {
        conta = new Account(account,holder);
        }
        sc.nextLine();
        System.out.println();
        System.out.println(conta);
        
        System.out.println();
        System.out.print("Enter a deposit value:");
        double depositValue = sc.nextDouble();
        conta.Deposito(depositValue);
        System.out.println("Updated Account date:");
        System.out.println(conta);
        
        System.out.println();
        System.out.print("Enter a withdraw value:");
        double withDrawValue = sc.nextDouble();
        conta.Saque(withDrawValue);
        System.out.println("Updated Account date:");
        System.out.println(conta);
	
	/*    System.out.println("Enter a deposit value:");
	    double deposit = sc.nextDouble();
	    conta.Deposito(deposit);//vouchamar aqui uma classe que depois vai chamar o set
	    
	    System.out.println("Update Account data:");
	    System.out.print("Account: "+ conta.getAccount()+" ,");
		System.out.print("Holder: "+ conta.getHolder()+" ,");
		System.out.print("Balance: $"+ conta.getSaldo()+"\n");
		
		System.out.println("Enter a withdraw value:");
		double saque = sc.nextDouble();
		conta.Saque(saque);//vouchamar aqui uma classe que depois vai chamar o set
		
		System.out.println("Update Account data:");
	    System.out.print("Account: "+ conta.getAccount()+" ,");
		System.out.print("Holder: "+ conta.getHolder()+" ,");
		System.out.print("Balance: $"+ conta.getSaldo()+"\n");*/
	}

}

