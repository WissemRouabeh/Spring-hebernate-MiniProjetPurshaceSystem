package com.example.wissem.wissemproject.service.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wissem.wissemproject.dao.entities.Client;
import com.example.wissem.wissemproject.dao.repository.ClientRepository;

@Service
public class ClientServiceImpl implements IClientService{
	
	@Autowired
    private ClientRepository repository;
	@Override
	public void addClient(Client client) {
		repository.save(client);
		
	}

	@Override
	public List<Client> getAll() {
        return repository.findAll();
	}

}
