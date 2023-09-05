/**
 * 
 */
package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

/**
 * @author August Neto
 *  
 *  ENUM para desempenho.
 *  
 */
public enum Desempenho {

	A_DESEJAR {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.03");
		}
	}, BOM {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.15");
		}
	}, OTIMO {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.20");
		}
	};

	/**
	 * Método que retorna a porcentagem de reajuste com base no status
	 * 
	 * @return BigDecimal
	 */
	public abstract BigDecimal percentualReajuste();
	
}
