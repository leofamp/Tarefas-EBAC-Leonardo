package br.com.lmarques.dao;

import java.util.Collection;

import br.com.lmarques.domain.Cliente;
import br.com.lmarques.exceptions.TipoChaveNaoEncontradaException;

public class ClienteDaoMock implements IClienteDAO {

	@Override
	public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
		return true;
	}

	@Override
	public void excluir(Long valor) {

	}

	@Override
	public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {

	}

	@Override
	public Cliente consultar(Long valor) {
		Cliente cliente = new Cliente();
		cliente.setCpf(valor);
		return cliente;
	}

	@Override
	public Collection<Cliente> buscarTodos() {
		return null;
	}


}
