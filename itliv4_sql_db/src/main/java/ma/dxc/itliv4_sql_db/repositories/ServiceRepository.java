package ma.dxc.itliv4_sql_db.repositories;

import ma.dxc.itliv4_sql_db.entities.ServiceClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ServiceClass, Long> {
}
