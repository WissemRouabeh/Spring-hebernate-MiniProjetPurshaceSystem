package com.example.wissem.wissemproject.service.produit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.wissem.wissemproject.dao.entities.Produit;
import com.example.wissem.wissemproject.dao.repository.ProduitRepository;

@Service
public class ProduitServiceImpl implements IProduitService{
	
	@Autowired
    private ProduitRepository repository;

	@Override
	public void addProduit(Produit produit) {
		repository.save(produit);
		
	}

	@Override
	public List<Produit> getAll() {
		return repository.findAll();
	}

	
	

}
