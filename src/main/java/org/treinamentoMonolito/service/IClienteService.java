package org.treinamentoMonolito.service;

import java.util.List;

import org.treinamentoMonolito.domain.Cliente;
import org.treinamentoMonolito.exceptions.DAOException;
import org.treinamentoMonolito.service.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
