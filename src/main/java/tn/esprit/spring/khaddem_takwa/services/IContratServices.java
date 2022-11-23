package tn.esprit.spring.khaddem_takwa.services;

import tn.esprit.spring.khaddem_takwa.entities.Contrat;
import tn.esprit.spring.khaddem_takwa.entities.Departement;

import java.util.List;

public interface IContratServices {
    List<Contrat> retrieveAllContrats();

    Contrat updateContrat (Contrat ce);

    Contrat addContrat (Contrat ce);

    Contrat retrieveContrat (Integer idContrat);

    void removeContrat(Integer idContrat);


}
