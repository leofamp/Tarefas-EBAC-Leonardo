package com.lmarques.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.lmarques.dao.IProdutoDAO;
import com.lmarques.domain.Produto;
import com.lmarques.services.generic.GenericService;

@Stateless
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {
	
	private IProdutoDAO produtoDao;

	@Inject
	public ProdutoService(IProdutoDAO produtoDao) {
		super(produtoDao);
		this.produtoDao = produtoDao;
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		return produtoDao.filtrarProdutos(query);
	}

}
