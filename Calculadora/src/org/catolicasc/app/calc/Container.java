package org.catolicasc.app.calc;

public class Container {
	
	private static Calculavel Calculadora = new CalculadoraElegante();
	
	public static Calculavel getCalculavel() {		
		return Calculadora;
	}
	

	public static Somar getSomar() {
		return new Somar();
	}

	public static Dividir getDividir() {
		return new Dividir();
	}

	public static Multiplicar getMultiplicar() {
		return new Multiplicar();
	}

	public static Subtrair getSubtrair() {
		return new Subtrair();
	}

}
