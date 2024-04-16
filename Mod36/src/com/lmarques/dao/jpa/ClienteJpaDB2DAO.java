package com.lmarques.dao.jpa;

import com.lmarques.dao.generic.jpa.GenericJpaDB2DAO;
import com.lmarques.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
