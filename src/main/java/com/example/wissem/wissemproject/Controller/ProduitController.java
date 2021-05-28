package com.example.wissem.wissemproject.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import com.example.wissem.wissemproject.dao.entities.Client;
import com.example.wissem.wissemproject.dao.entities.Commande;
import com.example.wissem.wissemproject.dao.entities.Produit;
import com.example.wissem.wissemproject.dto.ClientDTO;
import com.example.wissem.wissemproject.dto.CommandeDTO;
import com.example.wissem.wissemproject.dto.ProduitDTO;
import com.example.wissem.wissemproject.service.client.IClientService;
import com.example.wissem.wissemproject.service.commande.ICommandeService;
import com.example.wissem.wissemproject.service.produit.IProduitService;

import java.util.List;

@RestController
@RequestMapping("/rest/produit")

public class ProduitController {
	// Dependency injection: Autowiring the service bean to the controller bean
    @Autowired
    // The qualifier annotation is used when we have more than one bean of the same type
    // we need to specify the bean name that we want to inject
    @Qualifier("produitServiceImpl")
    private IProduitService service;

    //@RequestBody annotation to indicate that the the request object could be found in the HttpRequest body
    @PostMapping("/add")
    public void createProduit(@RequestBody ProduitDTO produit) {
        service.addProduit(ProduitDTO.fromDtoToEntity(produit));
    }


    @GetMapping("/all")
    public List<Produit> getAll() {
        return service.getAll();
    }

}