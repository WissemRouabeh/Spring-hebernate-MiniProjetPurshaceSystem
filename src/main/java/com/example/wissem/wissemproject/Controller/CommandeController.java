package com.example.wissem.wissemproject.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import com.example.wissem.wissemproject.dao.entities.Client;
import com.example.wissem.wissemproject.dao.entities.Commande;
import com.example.wissem.wissemproject.dto.ClientDTO;
import com.example.wissem.wissemproject.dto.CommandeDTO;
import com.example.wissem.wissemproject.service.client.IClientService;
import com.example.wissem.wissemproject.service.commande.ICommandeService;

import java.util.List;

@RestController
@RequestMapping("/rest/commande")

public class CommandeController {
	// Dependency injection: Autowiring the service bean to the controller bean
    @Autowired
    // The qualifier annotation is used when we have more than one bean of the same type
    // we need to specify the bean name that we want to inject
    @Qualifier("commandeServiceImpl")
    private ICommandeService service;

    //@RequestBody annotation to indicate that the the request object could be found in the HttpRequest body
    @PostMapping("/add")
    public void createCommande(@RequestBody CommandeDTO commande) {
    	
        service.addCommande(CommandeDTO.fromDtoToEntity(commande));
    }


    @GetMapping("/all")
    public List<Commande> getAll() {
        return service.getAll();
    }

}