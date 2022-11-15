package com.example.project.Project;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.project.Project.Repository.ProjectRepository;

@SpringBootTest
public class ProjectApplicationTests {

    @Autowired ProjectRepository projectRepository;
    
	@Test
	public void contextLoads() {
	   
	    
	}

}
