/**
 * 
 */
package br.com.mcoder.dao.generic.jpa;

import java.io.Serializable;

import br.com.mcoder.domain.jpa.Persistente;


public abstract class GenericJpaDB1DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB1DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre1");
	}

}
