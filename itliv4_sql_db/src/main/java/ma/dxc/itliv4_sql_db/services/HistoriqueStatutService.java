package ma.dxc.itliv4_sql_db.services;

import ma.dxc.itliv4_sql_db.entities.HistoriqueStatut;
import ma.dxc.itliv4_sql_db.repositories.HistoriqueStatutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class HistoriqueStatutService {
    @Autowired
    private HistoriqueStatutRepository historiqueStatutRepository;

    public HistoriqueStatut saveHistoriqueStatut(HistoriqueStatut historiqueStatut) {
        return historiqueStatutRepository.save(historiqueStatut);
    }

    public List<HistoriqueStatut> saveHistoriqueStatuts(List<HistoriqueStatut> historiqueStatuts) {
        return historiqueStatutRepository.saveAll(historiqueStatuts);
    }

    public List<HistoriqueStatut> getHistoriqueStatuts() {
        return historiqueStatutRepository.findAll();
    }

    public HistoriqueStatut getHistoriqueStatutById(Long id) {
        return historiqueStatutRepository.findById(id).orElse(null);
    }

    public String deleteHistoriqueStatut(Long id) {
        historiqueStatutRepository.deleteById(id);
        return "HistoriqueStatut " + id + " was deleted";
    }

    public HistoriqueStatut updateHistoriqueStatut(HistoriqueStatut historiqueStatut) {
        HistoriqueStatut existingHistoriqueStatut = historiqueStatutRepository.findById(historiqueStatut.getId()).orElse(null);
        Objects.requireNonNull(existingHistoriqueStatut).setDateCreation(historiqueStatut.getDateCreation());
        return historiqueStatutRepository.save(existingHistoriqueStatut);
    }
}
