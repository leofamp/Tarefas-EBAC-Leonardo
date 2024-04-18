package com.lmarques.dao;

import java.util.List;

import com.lmarques.dao.generic.IGenericDAO;
import com.lmarques.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
