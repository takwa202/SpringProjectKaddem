package tn.esprit.spring.khaddem_takwa.services;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.khaddem_takwa.entities.Contrat;
import tn.esprit.spring.khaddem_takwa.repositery.Contratrepositery;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Service
public class ContratServices implements  IContratServices{
    @Autowired
    Contratrepositery contratrepositery;
    @Override
    public List<Contrat> retrieveAllContrats() {
        return contratrepositery.findAll() ;
    }

    @Override
    public Contrat updateContrat(Contrat ce) {
        return contratrepositery.save(ce);
    }

    @Override
    public Contrat addContrat(Contrat ce) {
        return contratrepositery.save(ce);
    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {
        return contratrepositery.findById(idContrat).get();
    }

    @Override
    public void removeContrat(Integer idContrat) {
        contratrepositery.deleteById(idContrat);
    }
}
