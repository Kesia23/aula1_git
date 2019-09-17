package entities;

public class Retangulo {
   public double weidht;
   public double height;


public double areaRetangulo() {
   return weidht * height;
}

public double perimetro() {
	return 2*(weidht*height);
	
}

public double diagonalRetangulo() {
	return Math.sqrt((weidht*weidht)+(height*height));
}

}


