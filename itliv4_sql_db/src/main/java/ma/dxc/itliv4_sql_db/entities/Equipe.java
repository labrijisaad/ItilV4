package ma.dxc.itliv4_sql_db.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Entity @Table(name = "equipe")
public class Equipe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "libelle", length = 500)
    private String libelle;

    @ManyToMany
    private Collection<Utilisateur> utilisateurs = new ArrayList<>();

    @OneToMany(mappedBy = "equipe")
    private Collection<Ticket> tickets = new ArrayList<>();
}
