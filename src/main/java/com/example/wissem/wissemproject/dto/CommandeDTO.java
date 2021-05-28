package com.example.wissem.wissemproject.dto;

import java.sql.Date;

import com.example.wissem.wissemproject.dao.entities.Client;
import com.example.wissem.wissemproject.dao.entities.Commande;

import lombok.Data;

@Data
public class CommandeDTO {

	    private Long id;
	    private Long num;
	    private String status;
	    private Date date_cmd;
	    //private Client client;
	    private ClientDTO client;
	    /**
	     * Maps an entity object to a DTO object
	     * @param entity source
	     * @return a DTO containing the values acquired from the entity
	     */
	    public static CommandeDTO fromEntityToDto(Commande entity) {
	    	CommandeDTO dto = new CommandeDTO();
	    	dto.setId(entity.getId());
	    	dto.setNum(entity.getNum());
	    	dto.setStatus(entity.getStatus());
	    	dto.setDate_cmd(entity.getDate_cmd());
	    	dto.setDtoclient(ClientDTO.fromEntityToDto(entity.getClient())); //a trick
	        return dto;
	    }

	    /**
	     * Maps a DTO object to an entity object
	     * @param dto source
	     * @return an entity containing the values acquired from the DTO
	     */
	    public static Commande fromDtoToEntity(CommandeDTO dto) {
	    	Commande entity = new Commande();

	    	entity.setId(dto.getId());
	    	entity.setNum(dto.getNum());
	    	entity.setStatus(dto.getStatus());
	    	entity.setDate_cmd(dto.getDate_cmd());
	    	entity.setClient(ClientDTO.fromDtoToEntity(dto.getDtoclient())); //a trick

	        return entity;
	    }

		/*public Client getClient() {
			return client;
		}

		public void setClient(Client client) {
			this.client = client;
		} */ //todo:needs a solution two map client and commande

		public ClientDTO getDtoclient() {
			return client;
		}

		public void setDtoclient(ClientDTO client) {
			this.client = client;
		}

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
	    
	}