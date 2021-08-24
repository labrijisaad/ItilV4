package ma.dxc.itliv4_sql_db.controllers;

import ma.dxc.itliv4_sql_db.entities.Societe;
import ma.dxc.itliv4_sql_db.services.SocieteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class SocieteController {
    @Autowired
    private SocieteService societeService;

    @PostMapping("/addSociete")
    public Societe saveSociete(@RequestBody Societe societe) {
        return societeService.saveSociete(societe);
    }

    @PostMapping("/addSocietes")
    public List<Societe> saveSocietes(@RequestBody List<Societe> societes) {
        return societeService.saveSocietes(societes);
    }

    @GetMapping("/societes")
    public List<Societe> findAllSocietes() {
        return societeService.getSocietes();
    }

    @GetMapping("/societe/findById/{id}")
    public Societe getSocieteById(@PathVariable Long id) {
        return societeService.getSocieteById(id);
    }

    @PutMapping("/updateSociete")
    public Societe UpdateSociete(@RequestBody Societe societe) {
        return societeService.updateSociete(societe);
    }

    @DeleteMapping("/deleteSociete/{id}")
    public String deleteSociete(@PathVariable Long id) {
        return societeService.deleteSociete(id);
    }
}
