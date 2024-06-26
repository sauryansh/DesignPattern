package com.pritam.designpatter101.solid.interfaceseggregationprinciple.end.service;

import com.pritam.designpatter101.solid.interfaceseggregationprinciple.end.entity.Entity;

//common interface to be implemented by all persistence services. 
public interface PersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);

}
