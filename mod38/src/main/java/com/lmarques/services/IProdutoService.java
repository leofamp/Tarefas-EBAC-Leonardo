package com.lmarques.services;

import java.util.List;

import com.lmarques.domain.Produto;
import com.lmarques.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
