/**
 * 
 */
package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
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

	private ReajusteService reajusteservice;
	private Funcionario func;

	/**
	 * Método que inicializa as variaveis
	 */
	@BeforeEach
	public void inicializar() {
		reajusteservice = new ReajusteService();
		func = new Funcionario("Zeca", LocalDate.now(), new BigDecimal("1000"));
	}
	
	/**
	 * Teste para validar o calculo do reajuste para funcionarios à desejar
	 */
	@Test
	public void validaSeDesempenhoADesejarReajusteE3PorCento() {

		
		reajusteservice.concederReajuste(func, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"),func.getSalario());
	}
	
	/**
	 * Teste para validar o calculo do reajuste para funcionarios bom
	 */
	@Test
	void validaSeDesempenhoBomReajusteE15PorCento() {

		reajusteservice.concederReajuste(func, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"),func.getSalario());
	}
	
	/**
	 * Teste para validar o calculo do reajuste para funcionarios ótimo
	 */
	@Test
	void validaSeDesempenhoOtimoReajusteE20PorCento() {

		reajusteservice.concederReajuste(func, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"),func.getSalario());
	}
	
	/**
	 * Teste para validar o calculo do reajuste para funcionarios sem classificação
	 */
	@Test
	void validaSeDesempenhoNaoExistenteNaoSerReajustado() {

		reajusteservice.concederReajuste(func, null);
		assertEquals(new BigDecimal("1000.00"),func.getSalario());
	}

}
