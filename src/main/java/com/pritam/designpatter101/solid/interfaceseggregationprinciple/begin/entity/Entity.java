package com.pritam.designpatter101.solid.interfaceseggregationprinciple.begin.entity;

//Base class for all entities
public abstract class Entity {
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
