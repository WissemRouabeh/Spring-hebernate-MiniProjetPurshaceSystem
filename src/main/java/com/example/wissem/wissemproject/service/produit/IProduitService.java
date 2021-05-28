package com.example.wissem.wissemproject.service.produit;


import java.util.List;

import com.example.wissem.wissemproject.dao.entities.Produit;



public interface IProduitService {

    void addProduit(Produit produit);


    List<Produit> getAll();
}