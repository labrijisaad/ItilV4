package ma.dxc.itliv4_sql_db.repositories;

import ma.dxc.itliv4_sql_db.entities.CatalogueService;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CatalogueServiceRepository extends JpaRepository<CatalogueService, Long> {
    List<CatalogueService> findByDescriptionContains(String description);
}
