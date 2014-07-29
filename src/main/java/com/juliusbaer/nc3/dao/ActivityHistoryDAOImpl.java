package com.juliusbaer.nc3.dao;

import javax.ejb.Stateless;

import com.juliusbaer.nc3.model.ActivityHistory;

@Stateless
public class ActivityHistoryDAOImpl extends BaseDAOImpl<ActivityHistory> implements ActivityHistoryDAO {

	@Override
	protected Class<ActivityHistory> getEntityClass() {
		return ActivityHistory.class;
	}
}
