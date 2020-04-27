package com.exceptions;

public class Student {

    private String name;
    private String id;
    private Integer grade;

    public Student(String name, String id)
    {
    this.name=name;
    this.id=id;
    }

    public String getName()
    {
        return name;
    }

    public String getId()
    {
        return id;
    }

    public void setGrade(Integer grade)
    {
        this.grade=grade;

    }

    public Integer getGrade()
    {
        return grade;
    }
}
