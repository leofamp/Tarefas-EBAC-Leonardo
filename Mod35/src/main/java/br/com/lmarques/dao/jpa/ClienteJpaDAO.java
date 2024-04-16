package br.com.lmarques.dao.jpa;

import br.com.lmarques.dao.generic.jpa.GenericJpaDAO;
import br.com.lmarques.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
