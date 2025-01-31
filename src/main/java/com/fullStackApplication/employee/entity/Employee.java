package com.fullStackApplication.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

//to tell springboot that this is a JPA entity

@Entity
@Data
public class Employee {
    @Id // to make it a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // automatically increment ID by 1
    private long id;
    private String name;
    private String email;
    private String phone;
    private String department;
}
