package ma.dxc.itliv4_sql_db.repositories;

import ma.dxc.itliv4_sql_db.entities.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {
    List<Commentaire> findByDescriptionContains(String description);
}
