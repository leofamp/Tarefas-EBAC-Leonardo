package br.com.lmarques.dao;

import br.com.lmarques.dao.generic.IGenericDAO;
import br.com.lmarques.domain.Venda;
import br.com.lmarques.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
