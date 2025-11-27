package com.brunosilva.terpbuddy.Entities;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Users {

    //Mapping the columns to varibles
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String major;

    private String year;

    private String bio;

    //Constructors
    public Users() {

    }

    //Must have information
    public Users(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Users(Long id, String name, String email, String password, String major, String year, String bio) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.major = major;
        this.year = year;
        this.bio = bio;
    }

    //Generatiing the getters and setters
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", major='" + major + '\'' +
                ", year='" + year + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }
}
