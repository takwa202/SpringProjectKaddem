package tn.esprit.spring.khaddem_takwa.services;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.khaddem_takwa.entities.DetailEquipe;
import tn.esprit.spring.khaddem_takwa.repositery.DetailEquiperepositery;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Service
public class DetailsEquipeService implements IDetailServices {
    @Autowired

    DetailEquiperepositery detailEquiperepositery;

    @Override
    public List<DetailEquipe> retrieveAllDetailsEquipe() {
        return detailEquiperepositery.findAll();
    }

    @Override
    public Integer idDetailEquipeaddDetailsEquipe(DetailEquipe de) {
        return null;
    }

    @Override
    public DetailEquipe updateDetailsEquipe(DetailEquipe de) {
        return detailEquiperepositery.save(de);
    }

    @Override
    public DetailEquipe retrieveDetailsEquipe(Integer idDetailEquipe) {
        return detailEquiperepositery.findById(idDetailEquipe).get();
    }

    @Override
    public void deleteDetailsEquipe(Integer idDetailEquipe) {
        detailEquiperepositery.deleteById(idDetailEquipe);
    }
}
