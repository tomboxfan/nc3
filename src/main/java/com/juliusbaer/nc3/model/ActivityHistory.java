package com.juliusbaer.nc3.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the activity_history database table.
 * 
 */
@Entity
@Table(name="activity_history")
public class ActivityHistory extends com.juliusbaer.nc3.model.BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;

	@Column(name="PARTY_ID")
	private int partyId;

	private int version;

	public ActivityHistory() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPartyId() {
		return this.partyId;
	}

	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}