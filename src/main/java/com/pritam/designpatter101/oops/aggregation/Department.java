package com.pritam.designpatter101.oops.aggregation;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
@AllArgsConstructor
@Getter
public class Department {
    private String deptName;
    private List<Student> students;

    public void addStudent(Student student){
        students.add(student);
    }
}
