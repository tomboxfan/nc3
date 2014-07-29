package com.juliusbaer.nc3.dao;

import javax.ejb.Stateless;

import com.juliusbaer.nc3.model.Party;

@Stateless
public class PartyDAOImpl extends BaseDAOImpl<Party> {

	@Override
	protected Class<Party> getEntityClass() {
		return Party.class;
	}
}
