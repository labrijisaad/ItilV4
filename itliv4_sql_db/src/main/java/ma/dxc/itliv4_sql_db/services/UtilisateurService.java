package ma.dxc.itliv4_sql_db.services;

import ma.dxc.itliv4_sql_db.entities.Utilisateur;
import ma.dxc.itliv4_sql_db.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public List<Utilisateur> saveUtilisateurs(List<Utilisateur> utilisateurs) {
        return utilisateurRepository.saveAll(utilisateurs);
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    public Utilisateur getUtilisateurById(Long id) {
        return utilisateurRepository.findById(id).orElse(null);
    }

    public Utilisateur getUtilisateurByName(String nom) {
        return utilisateurRepository.findByNom(nom);
    }

    public String deleteUtilisateur(Long id) {
        utilisateurRepository.deleteById(id);
        return "User " + id + " was deleted";
    }

    public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
        Utilisateur existingUtilisateur = utilisateurRepository.findById(utilisateur.getId()).orElse(null);
        existingUtilisateur.setNom(utilisateur.getNom());
        existingUtilisateur.setPrenom(utilisateur.getPrenom());
        existingUtilisateur.setEmail(utilisateur.getEmail());
        return utilisateurRepository.save(existingUtilisateur);
    }
}
