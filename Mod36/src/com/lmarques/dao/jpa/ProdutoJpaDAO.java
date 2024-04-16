package com.lmarques.dao.jpa;

import com.lmarques.dao.generic.jpa.GenericJpaDB1DAO;
import com.lmarques.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
