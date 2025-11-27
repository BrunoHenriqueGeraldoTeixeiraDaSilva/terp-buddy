package com.brunosilva.terpbuddy.Entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "study_requests")
public class StudyRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Many StudyRequests can reference the same user
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    // Many StudyRequests can reference the same course
    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private UMDCourses course;

    @Column(nullable = false)
    private String message;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime timestamp;

    // No-args constructor
    public StudyRequest() {}

    // Constructor for required fields
    public StudyRequest(Users user, UMDCourses course, String message) {
        this.user = user;
        this.course = course;
        this.message = message;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public UMDCourses getCourse() {
        return course;
    }

    public void setCourse(UMDCourses course) {
        this.course = course;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "StudyRequest{" +
                "id=" + id +
                ", user=" + user.getId() +
                ", course=" + course.getId() +
                ", message='" + message + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}