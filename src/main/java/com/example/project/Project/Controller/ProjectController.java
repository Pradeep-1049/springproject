package com.example.project.Project.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swagger")
public class ProjectController {

	@GetMapping("/{name}/{version}")
	public String homePage(@PathVariable("name") String name,
			@PathVariable("version") String version, Model model) {
		model.addAttribute("filePath", "/swagger/" + name + '/' + version + "/swagger.yaml");
		return homePage(name, version, model);
	}

}