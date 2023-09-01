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

	@Test
	void validaSeDesempenhoADesejarReajusteE3PorCento() {

		ReajusteService reajusteservice = new ReajusteService();
		Funcionario func = new Funcionario("Zeca", LocalDate.now(), new BigDecimal("1000"));
		reajusteservice.concederReajuste(func, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"),func.getSalario());
	}

}
