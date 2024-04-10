package br.com.lmarques.services;

import br.com.lmarques.dao.IProdutoDAO;
import br.com.lmarques.domain.Produto;
import br.com.lmarques.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
