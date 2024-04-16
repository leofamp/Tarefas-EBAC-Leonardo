package br.com.lmarques.services;

import br.com.lmarques.dao.IClienteDAO;
import br.com.lmarques.domain.Cliente;
import br.com.lmarques.exceptions.DAOException;
import br.com.lmarques.exceptions.MaisDeUmRegistroException;
import br.com.lmarques.exceptions.TableException;
import br.com.lmarques.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	//private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		//this.clienteDAO = clienteDAO;
	}

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
