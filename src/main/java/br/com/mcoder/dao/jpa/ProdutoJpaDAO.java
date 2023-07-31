/**
 * 
 */
package br.com.mcoder.dao.jpa;

import br.com.mcoder.dao.generic.jpa.GenericJpaDAO;
import br.com.mcoder.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
