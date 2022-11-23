package tn.esprit.spring.khaddem_takwa.services;

import tn.esprit.spring.khaddem_takwa.entities.Equipe;

import java.util.List;

public interface IEquipeServices {
    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe(Equipe e);

    Equipe updateEquipe (Equipe e);

    Equipe retrieveEquipe (Long idEquipe);
    void deleteEquipe(Long idEquipe);
}
