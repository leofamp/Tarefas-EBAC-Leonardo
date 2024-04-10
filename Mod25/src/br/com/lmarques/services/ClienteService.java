package br.com.lmarques.services;

import br.com.lmarques.dao.IClienteDAO;
import br.com.lmarques.domain.Cliente;
import br.com.lmarques.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}

}