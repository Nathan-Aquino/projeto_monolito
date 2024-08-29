package org.treinamentoMonolito.service;

import java.util.List;

import javax.inject.Inject;

import org.treinamentoMonolito.dao.IClienteDAO;
import org.treinamentoMonolito.domain.Cliente;
import org.treinamentoMonolito.exceptions.DAOException;
import org.treinamentoMonolito.exceptions.MaisDeUmRegistroException;
import org.treinamentoMonolito.exceptions.TableException;
import org.treinamentoMonolito.service.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	private IClienteDAO clienteDAO;

	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		this.clienteDAO = clienteDAO;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cliente> filtrarClientes(String query) {
		return clienteDAO.filtrarClientes(query);
	}

}
