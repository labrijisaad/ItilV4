package ma.dxc.itliv4_sql_db.controllers;

import ma.dxc.itliv4_sql_db.entities.Equipe;
import ma.dxc.itliv4_sql_db.services.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EquipeController {
    @Autowired
    private EquipeService equipeService;

    @PostMapping("/addEquipe")
    public Equipe saveEquipe(@RequestBody Equipe equipe) {
        return equipeService.saveEquipe(equipe);
    }

    @PostMapping("/addEquipes")
    public List<Equipe> saveEquipes(@RequestBody List<Equipe> equipes) {
        return equipeService.saveEquipes(equipes);
    }

    @GetMapping("/equipes")
    public List<Equipe> findAllEquipes() {
        return equipeService.getEquipes();
    }

    @GetMapping("/equipes/findById/{id}")
    public Equipe getEquipesById(@PathVariable Long id) {
        return equipeService.getEquipeById(id);
    }

    @PutMapping("/updateEquipe")
    public Equipe UpdateEquipe(@RequestBody Equipe equipe) {
        return equipeService.updateEquipe(equipe);
    }

    @DeleteMapping("/deleteEquipe/{id}")
    public String deleteEquipe(@PathVariable Long id) {
        return equipeService.deleteEquipe(id);
    }

}
