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


}
