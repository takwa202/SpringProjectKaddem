package tn.esprit.spring.khaddem_takwa.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "DetailEquipe")
public class DetailEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetailEquipe")
    private Integer idDetailEquipe; // Clé primaire
    private String salle;
    private String thématique ;
    @OneToOne(mappedBy="detailEquipe")
    @JsonIgnore
    private Equipe equipe;
}



