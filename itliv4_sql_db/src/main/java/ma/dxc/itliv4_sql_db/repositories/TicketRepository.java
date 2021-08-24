package ma.dxc.itliv4_sql_db.repositories;

import ma.dxc.itliv4_sql_db.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
     List<Ticket> findByTitre(String titre);
}
