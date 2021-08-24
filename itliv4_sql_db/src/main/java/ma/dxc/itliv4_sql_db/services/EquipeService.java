package ma.dxc.itliv4_sql_db.services;

import ma.dxc.itliv4_sql_db.entities.Equipe;
import ma.dxc.itliv4_sql_db.repositories.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class EquipeService {
    @Autowired
    private EquipeRepository equipeRepository;

    public Equipe saveEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    public List<Equipe> saveEquipes(List<Equipe> equipes) {
        return equipeRepository.saveAll(equipes);
    }

    public List<Equipe> getEquipes() {
        return equipeRepository.findAll();
    }

    public Equipe getEquipeById(Long id) {
        return equipeRepository.findById(id).orElse(null);
    }

    public String deleteEquipe(Long id) {
        equipeRepository.deleteById(id);
        return "Equipe " + id + " was deleted";
    }

    public Equipe updateEquipe(Equipe equipe) {
        Equipe existingEquipe = equipeRepository.findById(equipe.getId()).orElse(null);
        Objects.requireNonNull(existingEquipe).setLibelle(equipe.getLibelle());
        return equipeRepository.save(existingEquipe);
    }
}
