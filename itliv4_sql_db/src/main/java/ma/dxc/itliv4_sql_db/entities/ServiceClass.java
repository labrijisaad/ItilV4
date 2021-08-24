package ma.dxc.itliv4_sql_db.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Entity @Table(name = "service")
public class ServiceClass {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "desc", length = 25)
    private String description;

    @OneToMany(mappedBy = "services")
    private Collection<Societe> societes = new ArrayList<>();

    @ManyToMany
    private Collection<Utilisateur> utilisateurs = new ArrayList<>();

}
