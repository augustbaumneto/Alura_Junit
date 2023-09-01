/**
 * 
 */
package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

/**
 * 
 * Classe teste da classe BonusService
 * 
 * @author August Neto
 *
 */
class BonusServiceTest {

	/**
	 * CAso de teste para funcionario com salario maior que 10000
	 */
	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService bonusservice = new BonusService();
		BigDecimal bonus = bonusservice.calcularBonus(new Funcionario("Jorginho", LocalDate.now(), new BigDecimal("24000")) );
		assertEquals(BigDecimal.ZERO,bonus);
	}
	
	/**
	 * Caso de teste para funcionario com salario menor que 10000
	 */
	@Test
	void bonusDeveriaSer10PorCentoDoSalarioComSalarioAte10000() {
		BonusService bonusservice = new BonusService();
		BigDecimal bonus = bonusservice.calcularBonus(new Funcionario("Mauricinho", LocalDate.now(), new BigDecimal("2500")) );
		assertEquals(new BigDecimal("250.0"),bonus);
	}

	/**
	 * Caso de teste para funcionario com salario igual a 10000
	 */
	@Test
	void bonusDeveriaSer10PorCentoParaFuncionarioCom10000() {
		BonusService bonusservice = new BonusService();
		BigDecimal bonus = bonusservice.calcularBonus(new Funcionario("Marcia", LocalDate.now(), new BigDecimal("10000")) );
		assertEquals(new BigDecimal("1000.0"),bonus);
	}
}
