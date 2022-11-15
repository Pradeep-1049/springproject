package com.example.project.Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Project.Entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
