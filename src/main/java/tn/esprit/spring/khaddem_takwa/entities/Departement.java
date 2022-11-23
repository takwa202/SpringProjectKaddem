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



@Table( name = "Departement")
public class Departement implements Serializable {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idDepart")
    private Integer idDepart; // Clé primaire
    private String nomDepat;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="departement")
    @JsonIgnore
    private Set<Etudiant> etudiant;


// Constructeur et accesseurs (getters) et mutateurs (setters)
}


