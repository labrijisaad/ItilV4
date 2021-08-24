package ma.dxc.itliv4_sql_db.controllers;

import ma.dxc.itliv4_sql_db.entities.Utilisateur;
import ma.dxc.itliv4_sql_db.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;

    @PostMapping("/addUtilisateur")
    public Utilisateur saveUtilisateur(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.saveUtilisateur(utilisateur);
    }

    @PostMapping("/addUtilisateurs")
    public List<Utilisateur> saveUtilisateurs(@RequestBody List<Utilisateur> utilisateurs) {
        return utilisateurService.saveUtilisateurs(utilisateurs);
    }

    @GetMapping("/utilisateurs")
    public List<Utilisateur> findAllUtilisateurs() {
        return utilisateurService.getUtilisateurs();
    }

    @GetMapping("/utilisateurs/findById/{id}")
    public Utilisateur getUtilisateurById(@PathVariable Long id) {
        return utilisateurService.getUtilisateurById(id);
    }

    @GetMapping("/utilisateur/findByName/{name}")
    public Utilisateur getUtilisateurByName(@PathVariable String name) {
        return utilisateurService.getUtilisateurByName(name);
    }

    @PutMapping("/updateUtilisateur")
    public Utilisateur UpdateProduct(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.updateUtilisateur(utilisateur);
    }

    @DeleteMapping("/deleteUtilisateur/{id}")
    public String deleteUtilisateur(@PathVariable Long id) {
        return utilisateurService.deleteUtilisateur(id);
    }
}
