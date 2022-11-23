package tn.esprit.spring.khaddem_takwa.entities;
import lombok.*;
import org.hibernate.annotations.Type;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Table( name = "Contrat")
public class Contrat implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
    private Integer idContrat; // Clé primaire
    @Temporal (TemporalType.DATE)
    private Date dateDebutContrat;
    @Temporal (TemporalType.DATE)
    private Date dateFinContrat;
    private Boolean archive;
    private Integer montantContart;

    private String nomE;
    @Enumerated(EnumType.STRING)

    private Specialite specialite;

    @ManyToOne
    Etudiant etudiant;

}
