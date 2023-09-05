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
		
			switch (desempenho) {
		
				case A_DESEJAR:
					reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
					funcionario.reajustarSalario(reajuste);
					break;
				case BOM:
					reajuste = funcionario.getSalario().multiply(new BigDecimal("0.15"));
					funcionario.reajustarSalario(reajuste);
					break;
				case OTIMO:
					reajuste = funcionario.getSalario().multiply(new BigDecimal("0.20"));
					funcionario.reajustarSalario(reajuste);
					break;
			}			
		}
		
	}

}
