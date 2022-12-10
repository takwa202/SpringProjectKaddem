package tn.esprit.spring.khaddem_takwa.services;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.khaddem_takwa.entities.Equipe;
import tn.esprit.spring.khaddem_takwa.repositery.Equiperepositery;
;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Service
public class EquipeServices implements IEquipeServices{
    @Autowired
    Equiperepositery equiperepositery;

    @Override

    public List<Equipe> retrieveAllEquipes() {
        return  equiperepositery.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return equiperepositery.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return equiperepositery.save(e);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return equiperepositery.findById(idEquipe).get();
    }

   @Override
    public void deleteEquipe(Integer idEquipe) {
equiperepositery.deleteById(idEquipe);
    }
}
