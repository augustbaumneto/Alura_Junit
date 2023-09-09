/**
 * 
 */
package br.com.alura.tdd.modelo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



/**
 * 
 * Classe de teste da classe calculadora
 * 
 * @author August Neto
 *
 */
public class CalculadoraTest {

	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		
		int soma = calc.somar(3, 7);
		
		Assert.assertEquals(10, soma);
	}
	
}
