/**
 * 
 */
package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

/**
 * @author August Neto
 *
 * classe que contem os testes de reajuste
 *
 */
class ReajusteServiceTest {

	/**
	 * Teste para validar o calculo do reajuste para funcionarios à desejar
	 */
	@Test
	void validaSeDesempenhoADesejarReajusteE3PorCento() {

		ReajusteService reajusteservice = new ReajusteService();
		Funcionario func = new Funcionario("Zeca", LocalDate.now(), new BigDecimal("1000"));
		reajusteservice.concederReajuste(func, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"),func.getSalario());
	}
	
	/**
	 * Teste para validar o calculo do reajuste para funcionarios bom
	 */
	@Test
	void validaSeDesempenhoBomReajusteE15PorCento() {

		ReajusteService reajusteservice = new ReajusteService();
		Funcionario func = new Funcionario("Liu", LocalDate.now(), new BigDecimal("1000"));
		reajusteservice.concederReajuste(func, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"),func.getSalario());
	}
	
	/**
	 * Teste para validar o calculo do reajuste para funcionarios ótimo
	 */
	@Test
	void validaSeDesempenhoOtimoReajusteE20PorCento() {

		ReajusteService reajusteservice = new ReajusteService();
		Funcionario func = new Funcionario("Tania", LocalDate.now(), new BigDecimal("1000"));
		reajusteservice.concederReajuste(func, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"),func.getSalario());
	}
	
	/**
	 * Teste para validar o calculo do reajuste para funcionarios sem classificação
	 */
	@Test
	void validaSeDesempenhoNaoExistenteNaoSerReajustado() {

		ReajusteService reajusteservice = new ReajusteService();
		Funcionario func = new Funcionario("Veraldo", LocalDate.now(), new BigDecimal("1000"));
		reajusteservice.concederReajuste(func, null);
		assertEquals(new BigDecimal("1000.00"),func.getSalario());
	}

}
