package com.juliusbaer.nc3.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the party_hist database table.
 * 
 */
@Entity
@Table(name="party_hist")
public class PartyHist extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="ACT_TAKEN_REMARKS")
	private String actTakenRemarks;

	@Column(name="CHINESE_NAME")
	private String chineseName;

	private String entity;

	@Column(name="INRQ_REMARKS")
	private String inrqRemarks;

	@Column(name="PARTY_FIRST_NAME")
	private String partyFirstName;

	@Column(name="PARTY_LAST_NAME")
	private String partyLastName;

	@Column(name="PARTY_MIDDLE_NAME")
	private String partyMiddleName;

	@Column(name="PARTY_NUMBER")
	private String partyNumber;

	@Column(name="PARTY_REMARKS")
	private String partyRemarks;

	private String status;

	private int version;

	//bi-directional many-to-one association to PartyEmbargoDetailHist
	@OneToMany(mappedBy="partyHist")
	private List<PartyEmbargoDetailHist> partyEmbargoDetailHists;

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

	public String getInrqRemarks() {
		return this.inrqRemarks;
	}

	public void setInrqRemarks(String inrqRemarks) {
		this.inrqRemarks = inrqRemarks;
	}

	public String getPartyFirstName() {
		return this.partyFirstName;
	}

	public void setPartyFirstName(String partyFirstName) {
		this.partyFirstName = partyFirstName;
	}

	public String getPartyLastName() {
		return this.partyLastName;
	}

	public void setPartyLastName(String partyLastName) {
		this.partyLastName = partyLastName;
	}

	public String getPartyMiddleName() {
		return this.partyMiddleName;
	}

	public void setPartyMiddleName(String partyMiddleName) {
		this.partyMiddleName = partyMiddleName;
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

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public List<PartyEmbargoDetailHist> getPartyEmbargoDetailHists() {
		return this.partyEmbargoDetailHists;
	}

	public void setPartyEmbargoDetailHists(List<PartyEmbargoDetailHist> partyEmbargoDetailHists) {
		this.partyEmbargoDetailHists = partyEmbargoDetailHists;
	}

	public PartyEmbargoDetailHist addPartyEmbargoDetailHist(PartyEmbargoDetailHist partyEmbargoDetailHist) {
		getPartyEmbargoDetailHists().add(partyEmbargoDetailHist);
		partyEmbargoDetailHist.setPartyHist(this);

		return partyEmbargoDetailHist;
	}

	public PartyEmbargoDetailHist removePartyEmbargoDetailHist(PartyEmbargoDetailHist partyEmbargoDetailHist) {
		getPartyEmbargoDetailHists().remove(partyEmbargoDetailHist);
		partyEmbargoDetailHist.setPartyHist(null);

		return partyEmbargoDetailHist;
	}

}