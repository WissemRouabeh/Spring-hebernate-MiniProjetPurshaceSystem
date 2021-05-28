package com.example.wissem.wissemproject.service.commande;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.wissem.wissemproject.dao.entities.Commande;
import com.example.wissem.wissemproject.dao.repository.CommandeRepository;

@Service
public class CommandeServiceImpl implements ICommandeService{
	
	@Autowired
    private CommandeRepository repository;

	@Override
	public void addCommande(Commande commande) {
		repository.save(commande);
		
	}

	@Override
	public List<Commande> getAll() {
		return repository.findAll();
	}
	

}
