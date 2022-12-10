package tn.esprit.spring.khaddem_takwa.services;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import tn.esprit.spring.khaddem_takwa.entities.Contrat;
import tn.esprit.spring.khaddem_takwa.entities.Departement;
import tn.esprit.spring.khaddem_takwa.entities.Equipe;
import tn.esprit.spring.khaddem_takwa.entities.Etudiant;
import tn.esprit.spring.khaddem_takwa.repositery.Contratrepositery;
import tn.esprit.spring.khaddem_takwa.repositery.Departementrepositery;
import tn.esprit.spring.khaddem_takwa.repositery.Equiperepositery;
import tn.esprit.spring.khaddem_takwa.repositery.Etudiantrepositery;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Service
public class EtudiantServices implements IEtudiantServices{
    @Autowired
    Etudiantrepositery etudiantrepositery;
    @Autowired
    Departementrepositery departementrepositery;
    @Autowired
    Contratrepositery contratrepositery;
    @Autowired
    Equiperepositery  equiperepositery;
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

    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {

        Equipe eq = equiperepositery.findById(idEquipe).get();
        Contrat c = contratrepositery.findById(idContrat).get();
       eq.getEtudiant().add(e);
        c.setEtudiant(e);
       etudiantrepositery.save(e);
        equiperepositery.save(eq);
        contratrepositery.save(c);
        return e;
    }

    @Override
    public List<Etudiant> getEtudiantsByDepartement(Integer idDepart) {
       /* List<Etudiant> etudiant = etudiantrepositery.findAll();
       List<Etudiant> etudiantfinal =  new ArrayList<Etudiant>();
        for (Etudiant etud : etudiant ) {
            if (etud.getDepartement().getIdDepart()==idDepart){
                etudiantfinal.add(etud);

            }
        }
        return  etudiantfinal;*/
        return etudiantrepositery.findByDepartementIdDepart(idDepart);
       //return etudiantrepositery.retrieveEtudiantBydepiddepart(idDepart);

    }




   /* @Override
    public  List<Etudiant> retrieveEtudiantByname(String prenomE) {

       return  etudiantrepositery.retrieveEtudiantByname(prenomE);
    }

    @Override
    public List<Etudiant> retrieveEtudiantBydepid(String nomDepat) {
        return  etudiantrepositery.retrieveEtudiantBydepid(nomDepat);
    }
*/
}
