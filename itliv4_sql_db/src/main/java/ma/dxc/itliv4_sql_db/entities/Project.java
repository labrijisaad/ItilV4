package ma.dxc.itliv4_sql_db.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Entity @Table(name = "project")
public class Project {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "desc", length = 25)
    private String description;

    @Column(name = "date_de_creation")
    @Temporal(TemporalType.DATE)
    private Date dateCreation;

    @Column(name = "cloture")
    private boolean cloture;

    @ManyToOne
    private Societe societe;

    @OneToMany(mappedBy = "project")
    private Collection<Ticket> tickets = new ArrayList<>();

    @OneToMany(mappedBy = "project")
    private Collection<CatalogueService> catalogueServices = new ArrayList<>();

}
