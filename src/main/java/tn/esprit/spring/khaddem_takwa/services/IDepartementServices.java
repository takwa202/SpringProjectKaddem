package tn.esprit.spring.khaddem_takwa.services;

import tn.esprit.spring.khaddem_takwa.entities.Departement;

import java.util.List;

public interface IDepartementServices {

    List<Departement> retrieveAllDepartements();

    Departement addDepartement (Departement d);

    Departement updateDepartement (Departement d);

    Departement retrieveDepartement (Integer idDepart);
    public void assignUniversiteToDepartement (Integer idUniversite , Integer idDepartement);
}
