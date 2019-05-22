package org.catolicasc.app.calc;

public class Calculadora implements Calculavel {

	@Override
	public double soma(double n1, double n2) {
		return (n1+n2);
	}

	@Override
	public double subtrair(double n1, double n2) {
		return (n1-n2); 
	}

	@Override
	public double multiplica(double n1, double n2) {
		return (n1 * n2);
	}

	@Override
	public double dividir(double n1, double n2) {
		return (n1 / n2);
	}	
	
}
