package ma.dxc.itliv4_sql_db.controllers;

import ma.dxc.itliv4_sql_db.entities.HistoriqueStatut;
import ma.dxc.itliv4_sql_db.services.HistoriqueStatutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class HistoriqueStatutController {
    @Autowired
    private HistoriqueStatutService historiqueStatutService;

    @PostMapping("/addHistoriqueStatut")
    public HistoriqueStatut saveHistoriqueStatut(@RequestBody HistoriqueStatut historiqueStatut) {
        return historiqueStatutService.saveHistoriqueStatut(historiqueStatut);
    }

    @PostMapping("/addHistoriqueStatuts")
    public List<HistoriqueStatut> saveHistoriqueStatuts(@RequestBody List<HistoriqueStatut> historiqueStatuts) {
        return historiqueStatutService.saveHistoriqueStatuts(historiqueStatuts);
    }

    @GetMapping("/historiqueStatuts")
    public List<HistoriqueStatut> findAllHistoriqueStatuts() {
        return historiqueStatutService.getHistoriqueStatuts();
    }

    @GetMapping("/historiqueStatuts/findById/{id}")
    public HistoriqueStatut getHistoriqueStatutById(@PathVariable Long id) {
        return historiqueStatutService.getHistoriqueStatutById(id);
    }

    @PutMapping("/updateHistoriqueStatut")
    public HistoriqueStatut UpdateHistoriqueStatut(@RequestBody HistoriqueStatut historiqueStatut) {
        return historiqueStatutService.updateHistoriqueStatut(historiqueStatut);
    }

    @DeleteMapping("/deleteHistoriqueStatut/{id}")
    public String deleteHistoriqueStatut(@PathVariable Long id) {
        return historiqueStatutService.deleteHistoriqueStatut(id);
    }
}
