package tn.esprit.spring.khaddem_takwa.entities;
import lombok.*;
import org.hibernate.annotations.Type;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder


@Table( name = "Equipe")
public class Equipe implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEquipe")
    private Integer idEquipe; // Clé primaire
    @NonNull
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    @OneToOne
    private DetailEquipe detailEquipe ;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiant;

// Constructeur et accesseurs (getters) et mutateurs (setters)
}

