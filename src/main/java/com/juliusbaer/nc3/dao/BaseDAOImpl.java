package com.juliusbaer.nc3.dao;

import java.util.List;
import java.util.Map;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;

import com.juliusbaer.nc3.model.BaseEntity;

@TransactionAttribute(TransactionAttributeType.REQUIRED)
public abstract class BaseDAOImpl<E extends BaseEntity> implements BaseDAO<E> {

	protected abstract Class<E> getEntityClass();

	@PersistenceContext(unitName = "primary")
	EntityManager em;

	@Override
	public void persist(E entity) {
		em.persist(entity);
	}

	@Override
	public void merge(E entity) {
		em.merge(entity);
	}

	@Override
	public E findById(Long id) {
		return (E) em.find(getEntityClass(), id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<E> findByNamedQuery(final String name, Object... params) {
		Query query = em.createNamedQuery(name);
		for (int i = 0; i < params.length; i++) {
			query.setParameter(i + 1, params[i]);
		}
		final List<E> result = (List<E>) query.getResultList();
		return result;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<E> findByNamedQueryAndNamedParams(final String name, final Map<String, ? extends Object> params) {
		Query query = em.createNamedQuery(name);
		for (Map.Entry<String, ? extends Object> param : params.entrySet()) {
			query.setParameter(param.getKey(), param.getValue());
		}
		final List<E> result = (List<E>) query.getResultList();
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<E> getAll() {
		return getCurrentSession().createCriteria(getEntityClass()).list();
	}
	
	@Override
	public int countAll() {
		return countByCriteria();
	}

	@Override
	public void update(E entity) {
		getCurrentSession().update(entity);
	}

	@Override
	public void refresh(E entity) {
		getCurrentSession().refresh(entity);
	}
	
	@Override
	public void delete(E entity) {
		getCurrentSession().delete(entity);
		getCurrentSession().flush();
		getCurrentSession().evict(entity);
	}

	private Session getCurrentSession() {
		return (Session) em.getDelegate();
	}
	
	private int countByCriteria(Criterion... criterion) {
		Criteria crit = getCurrentSession().createCriteria(getEntityClass());
		crit.setProjection(Projections.rowCount());
		for (final Criterion c : criterion) {
			crit.add(c);
		}
		return (Integer) crit.list().get(0);
	}
}
