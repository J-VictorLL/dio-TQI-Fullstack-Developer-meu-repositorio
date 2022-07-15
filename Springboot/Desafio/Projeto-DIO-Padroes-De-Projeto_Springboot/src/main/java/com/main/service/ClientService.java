package com.main.service;

import org.springframework.stereotype.Service;

import com.main.model.Cliente;

@Service
public interface ClientService {
	
	Iterable<Cliente> buscarTodos();
	Cliente buscarPorId(Long id);
	void inserir(Cliente cliente);
	void atualizar(Long id,Cliente cliente);
	void deletar(Long id);
}
