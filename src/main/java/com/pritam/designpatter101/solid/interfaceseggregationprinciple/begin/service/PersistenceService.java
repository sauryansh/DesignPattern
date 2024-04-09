package com.pritam.designpatter101.solid.interfaceseggregationprinciple.begin.service;

import java.util.List;

import com.pritam.designpatter101.solid.interfaceseggregationprinciple.begin.entity.Entity;

//common interface to be implemented by all persistence services. 
public interface PersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);

}
