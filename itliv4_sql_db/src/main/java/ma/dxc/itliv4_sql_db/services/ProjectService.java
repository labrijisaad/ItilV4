package ma.dxc.itliv4_sql_db.services;

import ma.dxc.itliv4_sql_db.entities.Project;
import ma.dxc.itliv4_sql_db.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    public List<Project> saveProjects(List<Project> projects) {
        return projectRepository.saveAll(projects);
    }

    public List<Project> getProjects() {
        return projectRepository.findAll();
    }

    public Project getProjectById(Long id) {
        return projectRepository.findById(id).orElse(null);
    }

    public String deleteProject(Long id) {
        projectRepository.deleteById(id);
        return "Project " + id + " was deleted";
    }

    public List<Project> findByCloture(Boolean etat){
        return projectRepository.findByCloture(etat);
    }

    public Project updateProject(Project project) {
        Project existingProject = projectRepository.findById(project.getId()).orElse(null);
        Objects.requireNonNull(existingProject).setDescription(project.getDescription());
        existingProject.setCloture(project.isCloture());
        existingProject.setDateCreation(project.getDateCreation());
        return projectRepository.save(existingProject);
    }
}
