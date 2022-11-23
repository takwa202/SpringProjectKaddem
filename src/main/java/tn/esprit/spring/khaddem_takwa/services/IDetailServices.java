package tn.esprit.spring.khaddem_takwa.services;

import tn.esprit.spring.khaddem_takwa.entities.DetailEquipe;

import java.util.List;

public interface IDetailServices {
    List<DetailEquipe> retrieveAllDetailsEquipe();

    Integer idDetailEquipeaddDetailsEquipe(DetailEquipe de);

    DetailEquipe updateDetailsEquipe (DetailEquipe de);

    DetailEquipe retrieveDetailsEquipe(Integer idDetailEquipe);

    void deleteDetailsEquipe(Integer idDetailEquipe);
}
