package com.lmarques.services;

import java.util.List;

import com.lmarques.domain.Cliente;
import com.lmarques.exceptions.DAOException;
import com.lmarques.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
