package com.juliusbaer.nc3.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the party_embargo_detail_hist database table.
 * 
 */
@Entity
@Table(name="party_embargo_detail_hist")
public class PartyEmbargoDetailHist extends com.juliusbaer.nc3.model.BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String identification;

	private String lang;

	private String remarks;

	private int score;

	private String status;

	private int version;

	@Column(name="WC_BL_VERSION")
	private int wcBlVersion;

	//bi-directional many-to-one association to PartyHist
	@ManyToOne
	@JoinColumn(name="PARTY_ID")
	private PartyHist partyHist;

	//bi-directional many-to-one association to WcBlResultHist
	@ManyToOne
	@JoinColumn(name="WC_BL_RESULT_ID")
	private WcBlResultHist wcBlResultHist;

	public PartyEmbargoDetailHist() {
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

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getWcBlVersion() {
		return this.wcBlVersion;
	}

	public void setWcBlVersion(int wcBlVersion) {
		this.wcBlVersion = wcBlVersion;
	}

	public PartyHist getPartyHist() {
		return this.partyHist;
	}

	public void setPartyHist(PartyHist partyHist) {
		this.partyHist = partyHist;
	}

	public WcBlResultHist getWcBlResultHist() {
		return this.wcBlResultHist;
	}

	public void setWcBlResultHist(WcBlResultHist wcBlResultHist) {
		this.wcBlResultHist = wcBlResultHist;
	}

}