package br.org.catolicasc.app.Test;

import org.catolicasc.app.calc.Calculadora;
import org.catolicasc.app.calc.CalculadoraElegante;
import org.catolicasc.app.calc.Calculavel;
import org.catolicasc.app.calc.Container;
import org.junit.Test;
import org.junit.Assert;


public class CalculavelTest {
	
	private Calculavel calc = Container.getCalculavel(Calculadora.class);
	private Calculavel calcElegante = Container.getCalculavel(CalculadoraElegante.class);
	
	
	@Test
	public void somarTest() {
		double result = calcElegante.soma(5d, 3d);
		Assert.assertEquals(result, 8d, 0.0);
	}
	
	@Test
	public void subtrairTest() {
		double result = calcElegante.subtrair(5d, 3d);
		Assert.assertEquals(result, 2d, 0.0);
	}
	
	@Test
	public void multiplicarTest() {
		double result = calcElegante.multiplica(5d, 3d);
		Assert.assertEquals(result, 15d, 0.0);
	}
	
	@Test
	public void dividirTest() {
		double result = calcElegante.dividir(3d, 2d);
		Assert.assertEquals(result, 1.5, 0.0);
	}

	
	// Testes Calculadora simples //
	
	@Test
	public void somarTestSimples() {
		double result2 = calc.soma(5d, 3d);
		Assert.assertEquals(result2, 8d, 0.0);
	}
	
	@Test
	public void subtrairTestSimples() {
		double result2 = calc.subtrair(5d, 3d);
		Assert.assertEquals(result2, 2d, 0.0);
	}
	
	@Test
	public void multiplicarTestSimples() {
		double result2 = calc.multiplica(5d, 3d);
		Assert.assertEquals(result2, 15d, 0.0);
	}
	
	@Test
	public void dividirTestSimples() {
		double result2 = calc.dividir(3d, 2d);
		Assert.assertEquals(result2, 1.5, 0.0);
	}
}
