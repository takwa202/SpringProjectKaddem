package tn.esprit.spring.khaddem_takwa.services;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.khaddem_takwa.entities.Departement;
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
public class DepartementServices implements IDepartementServices {
    @Autowired
    Departementrepositery departementrepositery;
    @Autowired
    Universiterepositery universiterepositery;
    @Override
    public List<Departement> retrieveAllDepartements() {
        return departementrepositery.findAll() ;
    }

    @Override
    public Departement addDepartement(Departement d) {
        return departementrepositery.save(d);
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return departementrepositery.save(d);
    }

    @Override
    public Departement retrieveDepartement(Integer idDepart) {
        return departementrepositery.findById(idDepart).get();
    }
    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Universite u = universiterepositery.findById(idUniversite).get();
       Departement d = departementrepositery.findById(idDepartement).get();
        u.getDepartments().add(d);
        universiterepositery.save(u);
    }

}
