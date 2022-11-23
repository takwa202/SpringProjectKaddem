package tn.esprit.spring.khaddem_takwa.services;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.khaddem_takwa.entities.Departement;
import tn.esprit.spring.khaddem_takwa.repositery.Departementrepositery;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Service
public class DepartementServices implements IDepartementServices {
    @Autowired
    Departementrepositery departementrepositery;
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
}
