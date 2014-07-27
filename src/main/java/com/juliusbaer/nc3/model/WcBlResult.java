package com.juliusbaer.nc3.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the wc_bl_result database table.
 * 
 */
@Entity
@Table(name="wc_bl_result")
public class WcBlResult extends com.juliusbaer.nc3.model.BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String category;

	private String chinesename;

	private String country;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_MODIFIED_DATE")
	private Date lastModifiedDate;

	private String lowqualityaliases;

	private String name;

	private String source;

	private String status;

	@Column(name="USR_ID")
	private String usrId;

	//bi-directional many-to-one association to PartyEmbargoDetail
	@OneToMany(mappedBy="wcBlResult")
	private List<PartyEmbargoDetail> partyEmbargoDetails;

	public WcBlResult() {
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getChinesename() {
		return this.chinesename;
	}

	public void setChinesename(String chinesename) {
		this.chinesename = chinesename;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLowqualityaliases() {
		return this.lowqualityaliases;
	}

	public void setLowqualityaliases(String lowqualityaliases) {
		this.lowqualityaliases = lowqualityaliases;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsrId() {
		return this.usrId;
	}

	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

	public List<PartyEmbargoDetail> getPartyEmbargoDetails() {
		return this.partyEmbargoDetails;
	}

	public void setPartyEmbargoDetails(List<PartyEmbargoDetail> partyEmbargoDetails) {
		this.partyEmbargoDetails = partyEmbargoDetails;
	}

	public PartyEmbargoDetail addPartyEmbargoDetail(PartyEmbargoDetail partyEmbargoDetail) {
		getPartyEmbargoDetails().add(partyEmbargoDetail);
		partyEmbargoDetail.setWcBlResult(this);

		return partyEmbargoDetail;
	}

	public PartyEmbargoDetail removePartyEmbargoDetail(PartyEmbargoDetail partyEmbargoDetail) {
		getPartyEmbargoDetails().remove(partyEmbargoDetail);
		partyEmbargoDetail.setWcBlResult(null);

		return partyEmbargoDetail;
	}

}