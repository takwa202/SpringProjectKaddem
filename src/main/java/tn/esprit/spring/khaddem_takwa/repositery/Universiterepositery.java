package tn.esprit.spring.khaddem_takwa.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.khaddem_takwa.entities.Universite;
@Repository

public interface Universiterepositery extends JpaRepository<Universite, Long> {


}