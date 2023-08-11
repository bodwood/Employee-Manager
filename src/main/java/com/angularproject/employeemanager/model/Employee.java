package com.angularproject.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

// @Entity annotation is used to indicate that instances of this class will
// be mapped to a database table.
@Entity
public class Employee implements Serializable{
    //@Id indicates the primary key of the database table.
    @Id
    //@GeneratedValue specifies how the pk values are generated.
    //In this case, the pk values are generated automatically to the id field.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column enforces constraints to the column.
    //This column can not be null and can not be updated.
    //This allows the id to be valid and unique.
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phoneNumber;
    private String imageUrl;
    //
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    //default constructor
    public Employee() {
    }

    //constructor with parameters
    public Employee(String name, String email, String jobTitle, String phoneNumber, String imageUrl, String employeeCode) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phoneNumber = phoneNumber;
        this.imageUrl = imageUrl;
        this.employeeCode = employeeCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    //Used in case we want to print out this employee object.
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                '}';
    }
}