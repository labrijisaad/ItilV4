package ma.dxc.itliv4_sql_db.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ma.dxc.itliv4_sql_db.enumerations.Nature;
import ma.dxc.itliv4_sql_db.enumerations.Priorite;
import ma.dxc.itliv4_sql_db.enumerations.Statut;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Entity @Table(name = "TICKET")
public class Ticket {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DESC", length = 25)
    private String description;

    @Column(name = "TITRE", length = 50)
    private String titre;

    @Column(name = "DATE_DE_CREATION")
    @Temporal(TemporalType.DATE)
    private Date dateCreation;

    @Column(name = "DATE_DE_CLOTURE")
    @Temporal(TemporalType.DATE)
    private Date dateCloture;

    @ManyToOne
    private Utilisateur utilisateur;

    @OneToMany(mappedBy = "ticket")
    private Collection<Commentaire> commentaires = new ArrayList<>();

    @ManyToOne
    private Project project;

    @ManyToOne
    private Equipe equipe;

    @Enumerated(EnumType.STRING)
    private Statut statut;

    @Enumerated(EnumType.STRING)
    private Priorite priorite;

    @OneToMany(mappedBy = "ticket")
    private Collection<HistoriqueStatut> historiqueStatuts = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private Nature nature;
}
