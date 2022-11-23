package tn.esprit.spring.khaddem_takwa.services;

import tn.esprit.spring.khaddem_takwa.entities.Etudiant;


import java.util.List;

public interface IEtudiantServices {
    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant (Etudiant e);

    Etudiant updateEtudiant (Etudiant e);

    Etudiant retrieveEtudiant(Integer idEtudiant);

    void removeEtudiant(Integer idEtudiant);

    public void assignEtudiantToDepartment(Integer idEtudiant,Integer idDepart);

}
