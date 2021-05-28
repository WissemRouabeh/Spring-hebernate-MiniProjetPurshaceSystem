package com.example.wissem.wissemproject.service.client;


import java.util.List;

import com.example.wissem.wissemproject.dao.entities.Client;



public interface IClientService {

    void addClient(Client client);

    List<Client> getAll();
}