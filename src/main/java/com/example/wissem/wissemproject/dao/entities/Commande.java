package com.example.wissem.wissemproject.dao.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;


/**
 * Entity class
 */
@Data
@Entity
public class Commande {


    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private Long num;
    private String status;
    private Date date_cmd;
    @OneToOne
	@JoinColumn(name = "client_id")
    private Client client;
    
    @OneToMany(mappedBy = "commande")
    private List<Produit> produits = new ArrayList<>();

    //getters and setters added due a probem with lombok
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate_cmd() {
		return date_cmd;
	}

	public void setDate_cmd(Date date_cmd) {
		this.date_cmd = date_cmd;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
    

}
