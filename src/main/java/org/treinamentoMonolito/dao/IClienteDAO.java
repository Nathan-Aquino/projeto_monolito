package org.treinamentoMonolito.dao;

import java.util.List;

import org.treinamentoMonolito.dao.generic.IGenericDAO;
import org.treinamentoMonolito.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

	List<Cliente> filtrarClientes(String query);

}
