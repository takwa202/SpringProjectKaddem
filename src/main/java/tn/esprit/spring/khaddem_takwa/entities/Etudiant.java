package tn.esprit.spring.khaddem_takwa.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Type;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Table( name = "Etudiant")
public class Etudiant implements Serializable {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Integer idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option option;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="etudiant")
    private Set<Contrat> contrat;

    @ManyToOne
    Departement departement;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Equipe> equipe;
// Constructeur et accesseurs (getters) et mutateurs (setters)
}
