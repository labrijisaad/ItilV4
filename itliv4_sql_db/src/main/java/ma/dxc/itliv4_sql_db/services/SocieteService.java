package ma.dxc.itliv4_sql_db.services;

import ma.dxc.itliv4_sql_db.entities.Societe;
import ma.dxc.itliv4_sql_db.repositories.SocieteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class SocieteService {
    @Autowired
    private SocieteRepository societeRepository;

    public Societe saveSociete(Societe societe) {
        return societeRepository.save(societe);
    }

    public List<Societe> saveSocietes(List<Societe> societes) {
        return societeRepository.saveAll(societes);
    }

    public List<Societe> getSocietes() {
        return societeRepository.findAll();
    }

    public Societe getSocieteById(Long id) {
        return societeRepository.findById(id).orElse(null);
    }

    public String deleteSociete(Long id) {
        societeRepository.deleteById(id);
        return "Societe " + id + " was deleted";
    }

    public Societe updateSociete(Societe societe) {
        Societe existingSociete = societeRepository.findById(societe.getId()).orElse(null);
        Objects.requireNonNull(existingSociete).setDescription(societe.getDescription());
        return societeRepository.save(existingSociete);
    }
}
