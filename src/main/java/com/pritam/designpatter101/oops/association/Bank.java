package com.pritam.designpatter101.oops.association;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class Bank {

    private String bankName;
    private Set<Employee> employees;
    public Bank(String bankName) {
        this.bankName = bankName;
    }

}
