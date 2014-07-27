package com.juliusbaer.nc3.dao;

import com.juliusbaer.nc3.model.ActivityHistory;

public class ActivityHistoryDAOImpl extends BaseDAOImpl<ActivityHistory> implements ActivityHistoryDAO {

	@Override
	protected Class<ActivityHistory> getEntityClass() {
		return ActivityHistory.class;
	}
}
