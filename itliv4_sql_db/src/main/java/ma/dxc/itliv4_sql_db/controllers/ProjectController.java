package ma.dxc.itliv4_sql_db.controllers;

import ma.dxc.itliv4_sql_db.entities.Project;
import ma.dxc.itliv4_sql_db.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @PostMapping("/addProject")
    public Project saveProject(@RequestBody Project project) {
        return projectService.saveProject(project);
    }

    @PostMapping("/addProjects")
    public List<Project> saveProjects(@RequestBody List<Project> projects) {
        return projectService.saveProjects(projects);
    }

    @GetMapping("/projects")
    public List<Project> findAllProjects() {
        return projectService.getProjects();
    }

    @GetMapping("/projects/findById/{id}")
    public Project getProjectById(@PathVariable Long id) {
        return projectService.getProjectById(id);
    }

    @GetMapping("/projects/findByCloture/{etat}")
    public List<Project> findByCloture(@PathVariable Boolean etat){
        return projectService.findByCloture(etat);
    }

    @PutMapping("/updateProject")
    public Project UpdateProduct(@RequestBody Project project) {
        return projectService.updateProject(project);
    }

    @DeleteMapping("/deleteProject/{id}")
    public String deleteProject(@PathVariable Long id) {
        return projectService.deleteProject(id);
    }
}
