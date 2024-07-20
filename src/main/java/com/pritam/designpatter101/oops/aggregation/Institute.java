package com.pritam.designpatter101.oops.aggregation;

import lombok.AllArgsConstructor;

import java.util.List;
@AllArgsConstructor
public class Institute {
    private String instituteName;
    private List<Department> departments;

    public void addDepartment(Department department){
        departments.add(department);
    }
    //Method of Institute class
    public int getTotalStudentInInstitute(){
        int noOfStudents = 0;
        List<Student> students = null;
        for(Department department: departments){
            students= department.getStudents();
            for(Student s : students){
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}
