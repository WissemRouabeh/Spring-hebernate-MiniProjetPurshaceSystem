package com.example.wissem.wissemproject.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.example.wissem.wissemproject.dao.entities.Client;
import com.example.wissem.wissemproject.dto.ClientDTO;
import com.example.wissem.wissemproject.service.client.IClientService;

import java.util.List;

@RestController
@RequestMapping("/rest/client")

public class ClientController {
	// Dependency injection: Autowiring the service bean to the controller bean
    @Autowired
    // The qualifier annotation is used when we have more than one bean of the same type
    // we need to specify the bean name that we want to inject
    @Qualifier("clientServiceImpl")
    private IClientService service;

    //@RequestBody annotation to indicate that the the request object could be found in the HttpRequest body

    @PreAuthorize("hasAnyRole('ADMIN1','USER1')")
    @PostMapping("/add")
    public void createClient(@RequestBody ClientDTO client) {
        service.addClient(ClientDTO.fromDtoToEntity(client));
    }

    

    @GetMapping("/all")
    public List<Client> getAll() {
        return service.getAll();
    }

}