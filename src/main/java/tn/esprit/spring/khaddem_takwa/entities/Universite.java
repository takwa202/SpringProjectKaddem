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
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Table( name = "Universite")
public class Universite implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idUniv")
    private Integer idUniv; // Clé primaire
    private String nomUniv;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> departement;

    public Integer getIdUniv() {
        return idUniv;
    }

    public void setIdUniv(Integer idUniv) {
        this.idUniv = idUniv;
    }

    public String getNomUniv() {
        return nomUniv;
    }

    public void setNomUniv(String nomUniv) {
        this.nomUniv = nomUniv;
    }

// Constructeur et accesseurs (getters) et mutateurs (setters)
}
