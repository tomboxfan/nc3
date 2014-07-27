package com.juliusbaer.nc3.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the party_embargo_detail database table.
 * 
 */
@Entity
@Table(name="party_embargo_detail")
public class PartyEmbargoDetail extends com.juliusbaer.nc3.model.BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String identification;

	private String lang;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_ON")
	private Date modifiedOn;

	private String remarks;

	private int score;

	private String status;

	//bi-directional many-to-one association to Party
	@ManyToOne
	private Party party;

	//bi-directional many-to-one association to WcBlResult
	@ManyToOne
	@JoinColumn(name="WC_BL_RESULT_ID")
	private WcBlResult wcBlResult;

	public PartyEmbargoDetail() {
	}

	public String getIdentification() {
		return this.identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Party getParty() {
		return this.party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public WcBlResult getWcBlResult() {
		return this.wcBlResult;
	}

	public void setWcBlResult(WcBlResult wcBlResult) {
		this.wcBlResult = wcBlResult;
	}

}