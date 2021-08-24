package ma.dxc.itliv4_sql_db.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ma.dxc.itliv4_sql_db.enumerations.Role;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Entity @Table(name = "UTILISATEUR")
public class Utilisateur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOM", length = 25)
    private String nom;

    @Column(name = "PRENOM", length = 25)
    private String prenom;

    @Column(name = "EMAIL", length = 25)
    private String email;

    @Column(name = "TELE", length = 10)
    private String tele;

    @Column(name = "PASSWORD", length = 25)
    private String motPasse;

    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToMany(mappedBy = "utilisateurs")
    private Collection<ServiceClass> services = new ArrayList<>();

    @OneToMany(mappedBy = "utilisateur")
    private Collection<Commentaire> commentaires = new ArrayList<>();

    @OneToMany(mappedBy = "utilisateur")
    private Collection<HistoriqueStatut> historiqueStatuts = new ArrayList<>();

    @ManyToMany(mappedBy = "utilisateurs")
    private Collection<Equipe> equipes = new ArrayList<>();

    @OneToMany(mappedBy = "utilisateur")
    private Collection<Ticket> tickets = new ArrayList<>();
}
