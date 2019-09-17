package entities;

public class Account {
    private int account;
	private String holder;
    private double saldo;
	
    public Account(int account, String holder, double initialDeposit) {
		this.account = account;
		this.holder = holder;
		Deposito(initialDeposit);
	}
    
	public Account(int account, String holder) {
		this.account = account;
		this.holder = holder;
	}



	public int getAccount() {
		return account;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void Deposito(double deposito) {
	    saldo+=deposito;
	}
	
	public void Saque(double saque) {
		saldo-=(saque + 5.0);
	}
	  
	public String toString(){
		return "Account"
				+account
				+",Holder: "
				+holder
				+", Balance: $"
				+String.format("%.2f", saldo);
		
	}
}
