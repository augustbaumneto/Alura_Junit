/**
 * 
 */
package br.com.alura.tdd.service;


import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

/**
 * @author August Neto
 *
 * Classe que irá aplicas os reajustes
 *
 */
public class ReajusteService {

	/**
	 * Método que calcula o salario reajustado e atualiza do funcionário
	 * @param funcionario
	 * @param desempenho
	 */
	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		BigDecimal reajuste;
		
		if(!(desempenho==null)) {
				reajuste = funcionario.getSalario().multiply(desempenho.percentualReajuste());
				funcionario.reajustarSalario(reajuste);	
		}			
		
	}

}
