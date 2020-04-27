package com.exceptions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Group {

    private int maxOccupancy;
    //private List<Student> students;
    private Set<Student> students;

    public Group(int maxOccupancy)
    {
        this.maxOccupancy = maxOccupancy;
        //students =new ArrayList<>();
        students= new HashSet<Student>();
    }

    public int getMaxOccupancy()
    {
        return maxOccupancy;
    }

    public void add(Student student) throws GroupOccupancyExceededException
    {
        if(students.contains(student))
        {
            return;
        }
        if(students.size() <maxOccupancy )
        {
            students.add(student);
        }
        else
        {
            throw new GroupOccupancyExceededException();
        }
    }

    public Set<Student> getStudents()
    {
        return students;
    }

    public int availability()
    {
        return maxOccupancy - students.size();
    }

    public double getAverage(){
        double sum=0;

        for(Student student: students )
        {
            sum += student.getGrade();
        }
        return sum/ students.size();
    }
}
