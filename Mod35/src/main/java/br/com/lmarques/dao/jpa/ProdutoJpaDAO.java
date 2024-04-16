package br.com.lmarques.dao.jpa;

import br.com.lmarques.dao.generic.jpa.GenericJpaDAO;
import br.com.lmarques.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
