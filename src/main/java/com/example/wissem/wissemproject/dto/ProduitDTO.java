
package com.example.wissem.wissemproject.dto;


import javax.persistence.Column;

import com.example.wissem.wissemproject.dao.entities.Commande;
import com.example.wissem.wissemproject.dao.entities.Produit;

import lombok.Data;

@Data
public class ProduitDTO {



		private Long id;
		private Long code;
		private String categorie;
		private int qty;
		private CommandeDTO commande;


	    /**
	     * Maps an entity object to a DTO object
	     * @param entity source
	     * @return a DTO containing the values acquired from the entity
	     */
	    public static ProduitDTO fromEntityToDto(Produit entity) {
	    	ProduitDTO dto = new ProduitDTO();
	        dto.setId(entity.getId());
	        dto.setCode(entity.getCode());
	        dto.setQty(entity.getQty());
	        dto.setCategorie(entity.getCategorie());
	        dto.setCommande(CommandeDTO.fromEntityToDto(entity.getCommande()));
	        return dto;
	    }

	    /**
	     * Maps a DTO object to an entity object
	     * @param dto source
	     * @return an entity containing the values acquired from the DTO
	     */
	    public static Produit fromDtoToEntity(ProduitDTO dto) {
	    	Produit entity = new Produit();
	    	entity.setId(dto.getId());
	    	entity.setCode(dto.getCode());
	    	entity.setQty(dto.getQty());
	    	entity.setCategorie(dto.getCategorie());
	    	entity.setCommande(CommandeDTO.fromDtoToEntity(dto.getCommande()));
	        return entity;
	    }

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

		public CommandeDTO getCommande() {
			return commande;
		}

		public void setCommande(CommandeDTO commande) {
			this.commande = commande;
		}

	}