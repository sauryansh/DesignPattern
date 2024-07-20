package com.pritam.designpatter101.oops.association;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee {
    private String name;
    public Employee(String name){
        this.name = name;
    }

}
