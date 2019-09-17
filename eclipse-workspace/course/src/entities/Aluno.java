package entities;

public class Aluno {
	public double notaF;
  
  public double notaFinal(double n1, double n2, double n3) {
	  return notaF = (n1+n2+n3);
  }
  public void result() { 
	  if(notaF>=60) {
	  System.out.println("PASS");
	  }
	  else {
	  System.out.printf("FAILED, it is necessary: %.2f", 100-notaF);
	    
	  }
  }
  
}
