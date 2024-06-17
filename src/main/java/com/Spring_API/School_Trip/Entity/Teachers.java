package com.Spring_API.School_Trip.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import org.aspectj.bridge.IMessage;

@Entity
@Table(name = "Teachers_Data")
public class Teachers {

    @Id
    @Column(name = "ID",unique = true)
    @NotEmpty(message = "Enter An Valid Id")
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$",message = "Should not contain special characters")
    String id;

    @Column(name = "Name",length = 50)
    @NotEmpty(message = "Name Cannot be empty")
    String name;

    @Column(name = "Subject")
    @NotEmpty(message = "Cannot be empty")
    String Sub;

    public Teachers() {
    }

    public Teachers(String id, String name, String sub) {
        this.id = id;
        this.name = name;
        Sub = sub;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSub() {
        return Sub;
    }

    public void setSub(String sub) {
        Sub = sub;
    }
}
