package tn.esprit.spring.khaddem_takwa.services;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import tn.esprit.spring.khaddem_takwa.entities.Departement;
import tn.esprit.spring.khaddem_takwa.entities.Etudiant;
import tn.esprit.spring.khaddem_takwa.repositery.Departementrepositery;
import tn.esprit.spring.khaddem_takwa.repositery.Etudiantrepositery;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Service
public class EtudiantServices implements IEtudiantServices{

    Etudiantrepositery etudiantrepositery;

    Departementrepositery departementrepositery;
    @Override

    public List<Etudiant> retrieveAllEtudiants() {


        return   etudiantrepositery.findAll();

    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {


        return  etudiantrepositery.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantrepositery.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {

       return etudiantrepositery.findById(idEtudiant).get();
    }


    @Override
    public void removeEtudiant(Integer idEtudiant) {
        etudiantrepositery.deleteById(idEtudiant);
    }

    @Override
    public void assignEtudiantToDepartment(Integer idEtudiant, Integer idDepart) {
        Etudiant et = etudiantrepositery.findById(idEtudiant).get();
        Departement d = departementrepositery.findById(idDepart).get();
        et.setDepartement(d);
        etudiantrepositery.save(et);

    }
}
