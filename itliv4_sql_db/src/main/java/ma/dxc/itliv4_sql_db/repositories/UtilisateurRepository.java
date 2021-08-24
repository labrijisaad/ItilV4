package ma.dxc.itliv4_sql_db.repositories;

import ma.dxc.itliv4_sql_db.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
     Utilisateur findByNom(String name);
}
