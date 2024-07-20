package com.pritam.designpatter101.oops.aggregation;

import java.util.ArrayList;
import java.util.List;

public class AggregationExample {
    public static void main(String[] args) {
        // Creating independent Student objects
        Student s1 = new Student("Pritam",1);
        Student s2 = new Student("Sachin",2);
        Student s3 = new Student("Priya",3);
        Student s4 = new Student("Rahul",4);
        // Creating an list of CSE Students
        List<Student> cse_students = new ArrayList<Student>();
        cse_students.add(s1);
        cse_students.add(s2);
        // Creating an initial list of EE Students
        List<Student> ece_students = new ArrayList<Student>();
        ece_students.add(s3);
        ece_students.add(s4);
        // Creating a Department object with a Students list
        // using Aggregation (Department "has" students)
        Department CSE = new Department("CSE",cse_students);
        Department ECE = new Department("CSE",ece_students);
        // Creating an initial list of Departments
        List<Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(ECE);
        // Creating an Institute object with a Departments list
        // using Aggregation (Institute "has" Departments)
        Institute institute =  new Institute("BITS", departments);

        System.out.println("Total Students in institute: "+ institute.getTotalStudentInInstitute());

    }
}
