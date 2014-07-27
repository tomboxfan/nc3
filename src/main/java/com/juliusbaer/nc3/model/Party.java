package com.juliusbaer.nc3.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


/**
 * The persistent class for the party database table.
 * 
 */
@Entity
public class Party extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="ACT_TAKEN_REMARKS")
	private String actTakenRemarks;

	@Column(name="CHINESE_NAME")
	private String chineseName;

	private String entity;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="INRQ_REMARKS")
	private String inrqRemarks;

	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="MIDDLE_NAME")
	private String middleName;

	@Column(name="PARTY_NUMBER")
	private String partyNumber;

	@Column(name="PARTY_REMARKS")
	private String partyRemarks;

	private String status;

	//bi-directional many-to-one association to PartyEmbargoDetail
	@OneToMany(mappedBy="party")
	private List<PartyEmbargoDetail> partyEmbargoDetails;

	public String getActTakenRemarks() {
		return this.actTakenRemarks;
	}

	public void setActTakenRemarks(String actTakenRemarks) {
		this.actTakenRemarks = actTakenRemarks;
	}

	public String getChineseName() {
		return this.chineseName;
	}

	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}

	public String getEntity() {
		return this.entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getInrqRemarks() {
		return this.inrqRemarks;
	}

	public void setInrqRemarks(String inrqRemarks) {
		this.inrqRemarks = inrqRemarks;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPartyNumber() {
		return this.partyNumber;
	}

	public void setPartyNumber(String partyNumber) {
		this.partyNumber = partyNumber;
	}

	public String getPartyRemarks() {
		return this.partyRemarks;
	}

	public void setPartyRemarks(String partyRemarks) {
		this.partyRemarks = partyRemarks;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<PartyEmbargoDetail> getPartyEmbargoDetails() {
		return this.partyEmbargoDetails;
	}

	public void setPartyEmbargoDetails(List<PartyEmbargoDetail> partyEmbargoDetails) {
		this.partyEmbargoDetails = partyEmbargoDetails;
	}

	public PartyEmbargoDetail addPartyEmbargoDetail(PartyEmbargoDetail partyEmbargoDetail) {
		getPartyEmbargoDetails().add(partyEmbargoDetail);
		partyEmbargoDetail.setParty(this);

		return partyEmbargoDetail;
	}

	public PartyEmbargoDetail removePartyEmbargoDetail(PartyEmbargoDetail partyEmbargoDetail) {
		getPartyEmbargoDetails().remove(partyEmbargoDetail);
		partyEmbargoDetail.setParty(null);

		return partyEmbargoDetail;
	}

}