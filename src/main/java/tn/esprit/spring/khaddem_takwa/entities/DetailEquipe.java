package tn.esprit.spring.khaddem_takwa.entities;
import lombok.*;
import org.hibernate.annotations.Type;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Repository
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Table( name = "DetailEquipe")
public class DetailEquipe implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idDetailEquipe")
    private Integer idDetailEquipe; // Clé primaire
    private Integer salle;
    private String thematique;
    @OneToOne(mappedBy="detailEquipe")
    private Equipe equipe ;

// Constructeur et accesseurs (getters) et mutateurs (setters)
}
