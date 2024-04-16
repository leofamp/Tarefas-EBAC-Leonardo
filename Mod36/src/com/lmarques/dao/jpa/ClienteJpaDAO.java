package com.lmarques.dao.jpa;

import com.lmarques.dao.generic.jpa.GenericJpaDB1DAO;
import com.lmarques.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
