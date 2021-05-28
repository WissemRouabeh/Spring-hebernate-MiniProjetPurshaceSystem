package com.example.wissem.wissemproject.dao.entities;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;


/**
 * Entity class
 */

@Data
@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    @Column(unique = true)
    private String email;
    private Long telephone;
    private String address;
    
    @OneToMany(mappedBy = "client")
    private List<Commande> commandes = new ArrayList<>();
    
    //getters and setters added due a probem with lombok
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getTelephone() {
		return telephone;
	}
	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
	}
