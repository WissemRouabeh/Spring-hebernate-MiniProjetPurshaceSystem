
package com.example.wissem.wissemproject.dao.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;


/**
 * Entity class
 */
@Data
@Entity
public class Produit {

	@Id
	@GeneratedValue
	private Long id;
	@Column(unique = true)
	private Long code;
	private String categorie;
	private int qty;

    @ManyToOne  
	@JoinColumn(name = "commande_id")
	private Commande commande;

    //getters and setters added due a probem with lombok
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public Commande getCommande() {
		return commande;
	}

}
