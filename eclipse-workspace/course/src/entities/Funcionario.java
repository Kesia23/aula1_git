package entities;

public class Funcionario {
    public String name;
    public double gross_salary;
    public double tax;
    
    //função que ira calcular o salario liquido e mostrará ele junto ao nome, recebera nome,salario bruto e taxa
    public void NetSalary(String name,double salary,double taxa) {
    //System.out.printf("Nome: %s, Salario Bruto: %.2f, Taxa: %.2f", name,salary,taxa);
    System.out.printf("Nome: %s, Salario liquido: %.2f\n",name,(salary-taxa));
    }
    public void Porcentagem(String name,double salary,double perc,double taxa) {
    double adicional = ((salary*perc)/100);
    System.out.printf("NovoSalário: %.2f\n",((salary-taxa)+adicional));
    }
}
