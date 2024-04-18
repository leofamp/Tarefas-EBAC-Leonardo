package com.lmarques.dao;

import java.util.List;

import com.lmarques.dao.generic.IGenericDAO;
import com.lmarques.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
