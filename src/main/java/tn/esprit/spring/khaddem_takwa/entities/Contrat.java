package tn.esprit.spring.khaddem_takwa.entities;
import com.fasterxml.jackson.databind.DatabindException;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

