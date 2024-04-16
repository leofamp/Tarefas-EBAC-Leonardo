package com.lmarques.dao.jpa;

import com.lmarques.dao.generic.jpa.IGenericJapDAO;
import com.lmarques.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
