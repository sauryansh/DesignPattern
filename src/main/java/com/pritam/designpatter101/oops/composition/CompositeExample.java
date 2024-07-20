package com.pritam.designpatter101.oops.composition;

public class CompositeExample {
    public static void main(String[] args) {
        Company techCompany = new Company("TCS");
        techCompany.addDepartment(new Department("Engineering"));
        techCompany.addDepartment(new Department("Operations"));
        techCompany.addDepartment(new Department("Human Resources"));
        techCompany.addDepartment(new Department("Finance"));

        int d = techCompany.getTotalDepartments();
        System.out.println("Total Departments: "+ d);

        System.out.println("Department names: ");
        for(Department dept : techCompany.getDepartments()){
            System.out.println(" - "+dept.getDepartmentName());;
        }
    }
}
