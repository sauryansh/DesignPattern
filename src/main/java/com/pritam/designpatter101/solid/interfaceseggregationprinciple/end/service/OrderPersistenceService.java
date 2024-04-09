package com.pritam.designpatter101.solid.interfaceseggregationprinciple.end.service;

import com.pritam.designpatter101.solid.interfaceseggregationprinciple.end.entity.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderPersistenceService implements PersistenceService<Order>{
	
	private static final Map<Long, Order> ORDERS = new HashMap<>();
	
	@Override
	public void save(Order entity) {
		synchronized (ORDERS) {
			ORDERS.put(entity.getId(), entity);
		}
	}

	@Override
	public void delete(Order entity) {
		synchronized (ORDERS) {
			ORDERS.remove(entity.getId());
		}
	}

	@Override
	public Order findById(Long id) {
		synchronized (ORDERS) {
			return ORDERS.get(id);
		}
	}
	//Remove dummy class as we don't have name as member of Order class so we should not create method for dummy implementation
/*	@Override
	public List<Order> findByName(String name) {
		throw new UnsupportedOperationException("Find by name is not supported");
	}*/
}
