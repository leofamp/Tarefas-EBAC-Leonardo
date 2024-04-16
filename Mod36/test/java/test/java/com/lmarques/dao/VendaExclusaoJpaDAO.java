package test.java.com.lmarques.dao;

import com.lmarques.dao.generic.jpa.GenericJpaDB1DAO;
import com.lmarques.dao.jpa.IVendaJpaDAO;
import com.lmarques.domain.jpa.VendaJpa;
import com.lmarques.exceptions.DAOException;
import com.lmarques.exceptions.TipoChaveNaoEncontradaException;

//Classe utilizada somente no teste para fazer a exclusão das vendas
public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
