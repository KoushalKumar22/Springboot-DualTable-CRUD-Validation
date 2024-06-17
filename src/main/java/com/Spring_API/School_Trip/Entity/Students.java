package com.Spring_API.School_Trip.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "Students_Data")
public class Students {

    @Id
    @Column(name = "RollNo",unique = true)
    @Range(min = 1,max = 45,message = "Roll no exceeds class limit")
    int rollno;

    @Column(name = "Name",length = 50)
    @NotEmpty(message = "Name Cannto Be Empty")
    String name;

    @Column(name = "Class")
    @NotNull(message = "Class cannot be null")
    @Range(min = 6,max = 12,message = "Class not allowed")
    int std;

    public Students() {
    }

    public Students(int rollno, String name, int std) {
        this.rollno = rollno;
        this.name = name;
        this.std = std;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }
}
