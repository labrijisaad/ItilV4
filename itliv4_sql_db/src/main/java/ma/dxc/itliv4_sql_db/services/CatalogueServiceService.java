package ma.dxc.itliv4_sql_db.services;

import ma.dxc.itliv4_sql_db.entities.CatalogueService;
import ma.dxc.itliv4_sql_db.repositories.CatalogueServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class CatalogueServiceService {
    @Autowired
    private CatalogueServiceRepository catalogueServiceRepository;

    public CatalogueService saveCatalogueService(CatalogueService catalogueService) {
        return catalogueServiceRepository.save(catalogueService);
    }

    public List<CatalogueService> saveCatalogueServices(List<CatalogueService> catalogueServices) {
        return catalogueServiceRepository.saveAll(catalogueServices);
    }

    public List<CatalogueService> getCatalogueServices() {
        return catalogueServiceRepository.findAll();
    }

    public List<CatalogueService> findByDescriptionContains(String content){
        return catalogueServiceRepository.findByDescriptionContains(content);
    }

    public CatalogueService getCatalogueServiceById(Long id) {
        return catalogueServiceRepository.findById(id).orElse(null);
    }

    public String deleteCatalogueService(Long id) {
        catalogueServiceRepository.deleteById(id);
        return "CatalogueService " + id + " was deleted";
    }

    public CatalogueService updateCatalogueService(CatalogueService catalogueService) {
        CatalogueService existingCatalogueService = catalogueServiceRepository.findById(catalogueService.getId()).orElse(null);
        Objects.requireNonNull(existingCatalogueService).setDescription(catalogueService.getDescription());
        return catalogueServiceRepository.save(existingCatalogueService);
    }
}
