package tn.esprit.spring.khaddem_takwa.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.khaddem_takwa.entities.Equipe;

import java.util.List;
@Repository

public interface Equiperepositery  extends JpaRepository<Equipe, Integer> {


}
