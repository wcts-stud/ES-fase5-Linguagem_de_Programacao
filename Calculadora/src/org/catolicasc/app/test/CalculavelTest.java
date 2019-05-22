package org.catolicasc.app.test;

import org.catolicasc.app.calc.Calculavel;
import org.catolicasc.app.calc.Container;
import org.junit.Test;
import org.junit.Assert;


public class CalculavelTest {

	private Calculavel calc = Container.getCalculavel();
	
	@Test
	public void somarTest() {
		double result = calc.soma(5d, 3d);
		Assert.assertEquals(result, 8d, 0.0);
	}
	
	@Test
	public void subtrairTest() {
		double result = calc.subtrair(5d, 3d);
		Assert.assertEquals(result, 2d, 0.0);
	}
	
	@Test
	public void multiplicarTest() {
		double result = calc.multiplica(5d, 3d);
		Assert.assertEquals(result, 15d, 0.0);
	}
	
	@Test
	public void dividirTest() {
		double result = calc.dividir(3d, 2d);
		Assert.assertEquals(result, 1.5, 0.0);
	}


	@Test
	public void dividirPorZeroTest() {
		try {
			double result = calc.dividir(3d, 0d);
		} catch (ArithmeticException ae) {
			Assert.assertEquals(ArithmeticException.class, ae.getClass());
		}
	}
}
