package br.com.carlosguilherme.dao;

import br.com.carlosguilherme.domain.Cliente;

import java.util.Collection;
import java.util.Set;

public abstract class ClienteSetDAO implements IClienteDAO {

	private Set<Cliente> set;

	public ClienteSetDAO() {

	}

	public Boolean cadastrar(Cliente cliente) {
		return this.set.add(cliente);
	}

	public void excluir(Long cpf) {
		Cliente clienteEncontrado = null;
		for (Cliente cliente : this.set) {
			if (cliente.getCpf().equals(cpf)) {
				clienteEncontrado = cliente;
				break;
			}
			if (clienteEncontrado != null) {
				this.set.remove(clienteEncontrado);
			}
		}
	}

	public void alterar(Cliente cliente) {
		if (this.set.contains(cliente)) {
			for (Cliente clienteCadastrado : this.set) {
				if (clienteCadastrado.equals(cliente)) {
					clienteCadastrado.setNome((cliente.getNome()));
					clienteCadastrado.setTel((cliente.getTel()));
					clienteCadastrado.setNumero((cliente.getNumero()));
					clienteCadastrado.setEnd((cliente.getEnd()));
					clienteCadastrado.setCidade((cliente.getCidade()));
					clienteCadastrado.setEstado((cliente.getEstado()));
					break;
				}
			}
		}
	}

	public Cliente consultar(Long cpf) {
		for (Cliente clienteCadastrado : this.set) {
			if (clienteCadastrado.getCpf().equals(cpf)) {
				return clienteCadastrado;
			}
		}
		return null;
	}

	public Collection<Cliente> buscarTodos() {
		return null;
	}
}
