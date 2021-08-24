package ma.dxc.itliv4_sql_db.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ma.dxc.itliv4_sql_db.enumerations.Statut;

import javax.persistence.*;
import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Entity @Table(name = "historique_statut")
public class HistoriqueStatut {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_de_creation")
    private Date dateCreation;

    @ManyToOne
    private Utilisateur utilisateur;

    @ManyToOne
    private Ticket ticket;

    @Enumerated(EnumType.STRING)
    private Statut statut;
}
