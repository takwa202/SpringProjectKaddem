package tn.esprit.spring.khaddem_takwa.services;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.khaddem_takwa.entities.Departement;
import tn.esprit.spring.khaddem_takwa.entities.Etudiant;
import tn.esprit.spring.khaddem_takwa.entities.Universite;
import tn.esprit.spring.khaddem_takwa.repositery.Departementrepositery;
import tn.esprit.spring.khaddem_takwa.repositery.Universiterepositery;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Service
public class UniversiteServices implements IUniversiteServices{
    @Autowired
    Universiterepositery universiterepositery;

    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiterepositery.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiterepositery.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiterepositery.save(u);
    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return universiterepositery.findById(idUniversite).get();
    }
    @Override
    public void deleteUniversite(Integer idUniversite) {
        universiterepositery.deleteById (idUniversite) ;
    }



}
