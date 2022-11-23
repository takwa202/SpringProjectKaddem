package tn.esprit.spring.khaddem_takwa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.esprit.spring.khaddem_takwa.entities.Departement;
import tn.esprit.spring.khaddem_takwa.entities.Etudiant;
import tn.esprit.spring.khaddem_takwa.repositery.Departementrepositery;
import tn.esprit.spring.khaddem_takwa.repositery.Etudiantrepositery;
import tn.esprit.spring.khaddem_takwa.services.IEtudiantServices;

@SpringBootApplication
public class KhaddemTakwaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KhaddemTakwaApplication.class, args);


        
    }



}
