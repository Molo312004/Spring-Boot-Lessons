package com.molier.jdbc_connection.Entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Specifies that the class is an entity and is mapped to a database table
@Data // Lombok annotation to generate getters, setters, toString, etc. for each data field
@Table(name = "students")  // Specifies the name of the database table to be used for mapping
@NoArgsConstructor // Lombok annotation to generate a no-argument constructor
@AllArgsConstructor // Lombok annotation to generate a constructor with 1 parameter for each field in the class e.g. Student(int id, String name, float gpa, String branch)
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "s_name")
    private String s_name;

    @Column(name = "gpa")
    private float gpa;

    @Column(name = "branch")
    private String branch;
}
