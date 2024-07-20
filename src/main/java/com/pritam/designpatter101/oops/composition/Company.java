package com.pritam.designpatter101.oops.composition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class Company {
    private String companyName;
    private List<Department> departments;

    public Company(String companyName){
        this.companyName = companyName;
        this.departments = new ArrayList<Department>();
    }
    public void addDepartment(Department department){
        departments.add(department);
    }

    public int getTotalDepartments(){
        return  departments.size();
    }
}
