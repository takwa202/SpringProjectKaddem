package tn.esprit.spring.khaddem_takwa.repositery;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.khaddem_takwa.entities.Etudiant;
import tn.esprit.spring.khaddem_takwa.entities.Niveau;

import java.util.List;
@Repository

public interface Etudiantrepositery extends JpaRepository<Etudiant,Integer>
{
  //  List<Etudiant>findByDepartementidDepart(Long idDepart);
  //  List<Etudiant>findByEquipeniveauLIKE(Niveau SENIOR);

}
