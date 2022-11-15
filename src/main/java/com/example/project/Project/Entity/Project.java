package com.example.project.Project.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "testdb")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(name = "name")
    public String name;
    @Column(name = "email")
    public String email;

    public Project(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Project() {
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Project [id=" + id + ", name=" + name + ", email=" + email + "]";
    }

    public void setId(int id) {
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

}
