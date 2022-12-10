package tn.esprit.spring.khaddem_takwa.services;

import org.springframework.data.repository.query.Param;
import tn.esprit.spring.khaddem_takwa.entities.Etudiant;


import java.util.List;

public interface IEtudiantServices {
    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant (Etudiant e);

    Etudiant updateEtudiant (Etudiant e);

    Etudiant retrieveEtudiant(Integer idEtudiant);

    void removeEtudiant(Integer idEtudiant);

    public void assignEtudiantToDepartment(Integer idEtudiant,Integer idDepart);

    Etudiant addAndAssignEtudiantToEquipeAndContract (Etudiant e, Integer idContrat , Integer idEquipe);
    List<Etudiant> getEtudiantsByDepartement (Integer idDepartement);


   // public  List<Etudiant> retrieveEtudiantByname(String prenomE);

   // public  List<Etudiant> retrieveEtudiantBydepid(String nomDepat);

}
