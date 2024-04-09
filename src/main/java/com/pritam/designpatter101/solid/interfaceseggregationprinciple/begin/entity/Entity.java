package com.pritam.designpatter101.solid.interfaceseggregationprinciple.begin.entity;

import lombok.Getter;
import lombok.Setter;

//Base class for all entities
@Setter
@Getter
public abstract class Entity {
    private Long id;
}
