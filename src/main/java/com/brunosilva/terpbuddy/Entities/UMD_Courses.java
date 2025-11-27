package com.brunosilva.terpbuddy.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "classes")
public class UMD_Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
