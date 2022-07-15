package com.main.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Cliente;
import com.main.model.Endereço;
import com.main.repository.ClienteRepository;
import com.main.repository.EndereçoRepository;
import com.main.service.ClientService;
import com.main.service.ViaCepService;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EndereçoRepository endereçoRepository;
	
	@Autowired
	private ViaCepService viaCepService;
	
	@Override
	public Iterable<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		Optional<Cliente> client = clienteRepository.findById(id);
		if(client.isEmpty()) return null;
		return client.get();
	}

	private void salvarClienteComCEP(Cliente cliente) {
		String cep = cliente.getEndereço().getCep();
		Endereço endereço = endereçoRepository.findById(cep).orElseGet(()->{
			Endereço novoEndereço = viaCepService.consultarCEP(cep);
			endereçoRepository.save(novoEndereço);
			return novoEndereço;
		});
		cliente.setEndereço(endereço);
		clienteRepository.save(cliente);
	}
	
	@Override
	public void inserir(Cliente cliente) {
		salvarClienteComCEP(cliente);
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		Optional<Cliente> client = clienteRepository.findById(id);
		if(client.isPresent()) {
			salvarClienteComCEP(cliente);
		}
	}

	@Override
	public void deletar(Long id) {
		clienteRepository.deleteById(id);		
	}

}
