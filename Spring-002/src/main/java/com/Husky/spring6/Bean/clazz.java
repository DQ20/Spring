package com.Husky.spring6.Bean;

import java.util.Arrays;

public class clazz {
    private String name;
    private Student[] students;

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "clazz{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
