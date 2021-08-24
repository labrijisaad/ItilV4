package ma.dxc.itliv4_sql_db.controllers;

import ma.dxc.itliv4_sql_db.entities.CatalogueService;
import ma.dxc.itliv4_sql_db.services.CatalogueServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CatalogueServiceController {
    @Autowired
    private CatalogueServiceService catalogueServiceService;

    @PostMapping("/addCatalogueService")
    public CatalogueService saveCatalogueService(@RequestBody CatalogueService catalogueService) {
        return catalogueServiceService.saveCatalogueService(catalogueService);
    }

    @PostMapping("/addCatalogueServices")
    public List<CatalogueService> saveCatalogueServices(@RequestBody List<CatalogueService> catalogueServices) {
        return catalogueServiceService.saveCatalogueServices(catalogueServices);
    }

    @GetMapping("/catalogueServices")
    public List<CatalogueService> findAllCatalogueServices() {
        return catalogueServiceService.getCatalogueServices();
    }

    @GetMapping("/catalogueServices/findById/{id}")
    public CatalogueService getCatalogueServiceById(@PathVariable Long id) {
        return catalogueServiceService.getCatalogueServiceById(id);
    }

    @PutMapping("/updateCatalogueService")
    public CatalogueService UpdateCatalogueService(@RequestBody CatalogueService catalogueService) {
        return catalogueServiceService.updateCatalogueService(catalogueService);
    }

    @DeleteMapping("/deleteCatalogueService/{id}")
    public String deleteCatalogueService(@PathVariable Long id) {
        return catalogueServiceService.deleteCatalogueService(id);
    }
}
