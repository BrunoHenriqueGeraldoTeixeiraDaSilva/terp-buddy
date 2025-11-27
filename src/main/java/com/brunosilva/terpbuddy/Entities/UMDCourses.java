package com.brunosilva.terpbuddy.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "classes")
public class UMDCourses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String name;

    private String department;

    //Constructors

    public UMDCourses() {

    }
    public UMDCourses(Long id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public UMDCourses(Long id, String code, String name, String department) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.department = department;
    }


    //Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "UMD_Courses{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
