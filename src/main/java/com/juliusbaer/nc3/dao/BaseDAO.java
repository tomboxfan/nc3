package com.juliusbaer.nc3.dao;

import java.util.List;
import java.util.Map;

import com.juliusbaer.nc3.model.BaseEntity;

public interface BaseDAO <E extends BaseEntity> {
	
    void persist(E entity);
    
    void merge(E entity);
    
    E findById(Long id);
    
    List<E> findByNamedQuery(final String name, Object... params);
    
	List<E> findByNamedQueryAndNamedParams(final String queryName, final Map<String, ? extends Object> params);
    
    List<E> getAll();
    
    int countAll();
    
    void update(E entity);
    
    void refresh(E entity);
    
    void delete(E entity);
}
