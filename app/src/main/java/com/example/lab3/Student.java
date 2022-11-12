package com.example.lab3;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private String groupName;

    public Student(String name, String groupName) {
        this.name=name;
        this.groupName=groupName;
    }

    public String getName(){
        return name;
    }
    public String getGroupName(){
        return groupName;
    }
    private final static ArrayList<Student> students = new ArrayList<Student>(
            Arrays.asList(
                    new Student("Абрамов Кирило", "К20-3"),
                    new Student("Безродний Олександр", "К20-3"),
                    new Student("Гасенко Євген", "К20-3"),
                    new Student("Головко Микита", "К20-3"),
                    new Student("Кобрись Олександр", "К21-3"),
                    new Student("Коваль Юрій", "К21-3"),
                    new Student("Нужна Яна", "К21-3")
            )
    );
    public static ArrayList<Student> getStudents(String groupName){
        ArrayList<Student> stList = new ArrayList<>();
        for (Student s: students){
            if(s.getGroupName().equals(groupName)){
                stList.add(s);
            }
        }
        return stList;
    }
}

