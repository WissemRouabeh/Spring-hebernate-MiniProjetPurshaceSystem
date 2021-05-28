package com.example.wissem.wissemproject.dto;

import com.example.wissem.wissemproject.dao.entities.Client;

import lombok.Data;

import lombok.Data;
@Data
public class ClientDTO {

	    private Long id;
	    private String nom;
	    private String prenom;
	    private String email;
	    private Long telephone;
	    private String address;

	    /**
	     * Maps an entity object to a DTO object
	     * @param entity source
	     * @return a DTO containing the values acquired from the entity
	     */
	    public static ClientDTO fromEntityToDto(Client entity) {
	    	ClientDTO dto = new ClientDTO();

	    	dto.setId(entity.getId());
	    	dto.setNom(entity.getNom());
	    	dto.setPrenom(entity.getPrenom());
	    	dto.setAddress(entity.getAddress());
	    	dto.setEmail(entity.getEmail());
	    	dto.setTelephone(entity.getTelephone());

	        return dto;
	    }

	    /**
	     * Maps a DTO object to an entity object
	     * @param dto source
	     * @return an entity containing the values acquired from the DTO
	     */
	    public static Client fromDtoToEntity(ClientDTO dto) {
	        Client entity = new Client();
	        entity.setId(dto.getId());
	        entity.setNom(dto.getNom());
	        entity.setPrenom(dto.getPrenom());
	    	entity.setAddress(dto.getAddress());
	    	entity.setEmail(dto.getEmail());
	    	entity.setTelephone(dto.getTelephone());
	        return entity;
	    }

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