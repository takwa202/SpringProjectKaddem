package tn.esprit.spring.khaddem_takwa.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.khaddem_takwa.entities.Contrat;
import tn.esprit.spring.khaddem_takwa.entities.Departement;
import tn.esprit.spring.khaddem_takwa.repositery.Departementrepositery;
import tn.esprit.spring.khaddem_takwa.services.DepartementServices;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/departement")
public class DepartementContoroller {
    @Autowired
    DepartementServices departementServices;
    // http://localhost:8089/kaddem/retrieve-all-contrat
    @GetMapping("/retrieve-all-contrat")
    public List<Departement> getDepartement() {

        return  departementServices.retrieveAllDepartements();
    }
   // http://localhost:8089/kaddem/retrieve-Departement/{Departement-id}
    @GetMapping("/retrieve-Departement/{Departement-id}")
    public Departement retrieveContrat(@PathVariable("Departement-id") Integer idDepart) {
        return departementServices.retrieveDepartement(idDepart);}
    // http://localhost:8089/kaddem/departement/add-departement
    @PostMapping("/add-departement")
    public Departement adddepartement(@RequestBody Departement e) {
        Departement Departement = departementServices.addDepartement(e);
        return Departement;
    }
    // http://localhost:8089/kaddem/remove-Departement/{Departement-id}
    @DeleteMapping("/remove-Departement/{Departement-id}")
    public void removecontrat(@PathVariable("Departement-id") Long idDepart) {
     //   departementServices.removeContrat(Math.toIntExact(idContrat));
    }
    // http://localhost:8089/kaddem/update-departement
    @PutMapping("/update-departement")
    public Departement updateDepartement(@RequestBody Departement e) {
        Departement Departement= departementServices.updateDepartement(e);
        return Departement;
    }

    // http://localhost:8089/kaddem/departement/affecter-university-departement/{university-id}/{university-id}
    @PostMapping ("/affecter-university-departement/{university-id}/{department-id}")
    public void assignUniversiteToDepartement(@PathVariable("university-id")Integer idUniv ,
                                              @PathVariable("department-id")Integer idDepart)
    {
        departementServices.assignUniversiteToDepartement(idUniv,idDepart);
    }

}
