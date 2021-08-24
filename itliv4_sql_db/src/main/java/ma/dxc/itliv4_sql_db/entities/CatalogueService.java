package ma.dxc.itliv4_sql_db.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ma.dxc.itliv4_sql_db.enumerations.Priorite;

import javax.persistence.*;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Entity @Table(name = "catalogue_Service")
public class CatalogueService {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description", length = 500)
    private String description;

    @ManyToOne
    private Project project;

    @Enumerated(EnumType.STRING)
    private Priorite priorite;
}
