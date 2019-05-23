package org.catolicasc.app.calc;

public class Container {
	
	private static Calculavel Calculadora = new CalculadoraElegante();
	
	public static Calculavel getCalculavel(Object obj) {
		if(obj == CalculadoraElegante.class) {
			Calculadora = new CalculadoraElegante();
		}else {
			if (obj == Calculadora.class) {
				Calculadora = new Calculadora();
			}
		}
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
