package com.brunosilva.terpbuddy.Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import jakarta.persistence.*;

@Entity
@Table(name = "user_classes")
public class UserCourses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Many UserCourses entries can reference the same user
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Many UserCourses entries can reference the same course
    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private UMDCourses course;

    // No-args constructor required by JPA
    public UserCourses() {}

    // Constructor for required fields
    public UserCourses(User user, UMDCourses course) {
        this.user = user;
        this.course = course;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UMDCourses getCourse() {
        return course;
    }

    public void setCourse(UMDCourses course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "UserCourses{" +
                "id=" + id +
                ", user=" + user.getId() +
                ", course=" + course.getId() +
                '}';
    }
}