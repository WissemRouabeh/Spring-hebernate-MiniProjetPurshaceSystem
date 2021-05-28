package com.example.wissem.wissemproject.service.commande;


import java.util.List;

import com.example.wissem.wissemproject.dao.entities.Commande;



public interface ICommandeService {

    void addCommande(Commande commande);


    List<Commande> getAll();
}