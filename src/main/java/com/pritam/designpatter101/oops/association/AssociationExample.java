package com.pritam.designpatter101.oops.association;

import java.util.HashSet;
import java.util.Set;

public class AssociationExample {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Pritam");
        Employee emp2 = new Employee("Vijay");

        // adding the employees to a set
        Set<Employee> employees = new HashSet<>();
        employees.add(emp1);
        employees.add(emp2);

        // Creating a Bank object
        Bank bank = new Bank("ICICI");
        // setting the employees for the Bank object
        bank.setEmployees(employees);

        // traversing and displaying the bank employees
        for (Employee emp : bank.getEmployees()) {
            System.out.println(emp.getName()
                    + " belongs to bank "
                    + bank.getBankName());
        }
    }
}

/**
 * In the above example, two separate classes Bank and Employee are associated through their Objects. Bank can have many employees, So, it is a one-to-many relationship.
 */
