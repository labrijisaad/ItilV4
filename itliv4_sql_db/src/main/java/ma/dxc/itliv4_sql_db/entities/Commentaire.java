package ma.dxc.itliv4_sql_db.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Entity @Table(name = "commentaire")
public class Commentaire {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description", length = 500)
    private String description;

    @ManyToOne
    private Utilisateur utilisateur;

    @ManyToOne
    private Ticket ticket;
}



