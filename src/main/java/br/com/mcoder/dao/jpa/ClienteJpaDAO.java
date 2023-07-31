/**
 * 
 */
package br.com.mcoder.dao.jpa;

import br.com.mcoder.dao.generic.jpa.GenericJpaDAO;
import br.com.mcoder.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
