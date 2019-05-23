package org.catolicasc.app.calc;

public class CalculadoraElegante implements Calculavel {

	private Somar somar = Container.getSomar();
	private Subtrair sub = Container.getSubtrair();
	private Multiplicar mult = Container.getMultiplicar();
	private Dividir div = Container.getDividir();
	
	
	@Override
	public double soma(double n1, double n2) {
		return this.somar.executar(n1, n2);
	}

	@Override
	public double subtrair(double n1, double n2) {
		return this.sub.executar(n1, n2);
	}

	@Override
	public double multiplica(double n1, double n2) {
		return this.mult.executar(n1, n2);
	}

	@Override
	public double dividir(double n1, double n2) {
		return this.div.executar(n1, n2);
	}

}
