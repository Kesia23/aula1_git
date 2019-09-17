package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira numero de linhas");
		int m = sc.nextInt();
		sc.nextLine();
		System.out.println("Insira numero de colunas");
		int n = sc.nextInt();
		int [][] mat=new int[m][n];
		//sc.nextLine();
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
			//	System.out.println("Insira o numero:");
			//	int numero = sc.nextInt();
				mat[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]+" ");
				if(j+1==n) {
					System.out.println("\n");
				}
			}
		}
		System.out.println();
		System.out.println("Insira X ");
		int X=sc.nextInt();
		//colocar a posicao
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
			    if(mat[i][j]==X) {
			    	System.out.println("Position: "+i+","+j);
			    	if(i-1>=0) {//de cima
			    		System.out.println("Up: "+mat[i-1][j]);
			    	}
			    	if(i+1<m) {//de baixo
			    		System.out.println("Down: "+mat[i+1][j]);
			    	}
			    	if(j!=0) {//da esquerda
			    		System.out.println("Left: "+mat[i][j-1]);
			    	}
			    	if(j+1<n) {//da direita
			    		System.out.println("Right: "+mat[i][j+1]);
			    	}
			    }
			}
		}
		
		sc.close();

		System.exit(0);
	}

}
