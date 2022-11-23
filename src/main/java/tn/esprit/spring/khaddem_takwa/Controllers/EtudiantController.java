package tn.esprit.spring.khaddem_takwa.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.khaddem_takwa.entities.Etudiant;
import tn.esprit.spring.khaddem_takwa.services.IEtudiantServices;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {

    IEtudiantServices etudiantService;



    // http://localhost:8089/kaddem/etudiant/retrieve-all-etudiants
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiants();
        return listEtudiants;
    }

    // http://localhost:8089/kaddem/etudiant/retrieve-etudiant/8
    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long idEtudiant) {
        return etudiantService.retrieveEtudiant(idEtudiant.intValue());
    }

    // http://localhost:8089/kaddem/etudiant/add-etudiant
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant et) {
        Etudiant etudiant = etudiantService.addEtudiant(et);
        return etudiant;
    }
    // http://localhost:8089/kaddem/etudiant/remove-etudiant/1
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeOperateur(@PathVariable("etudiant-id") Long idEtudiant) {
        etudiantService.removeEtudiant(idEtudiant.intValue());
    }

    // http://localhost:8089/kaddem/etudiant/update-etudiant
    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant et) {
        Etudiant etudiant= etudiantService.updateEtudiant(et);
        return etudiant;
    }
    // http://localhost:8089/kaddem/etudiant/affecter-etudiant-departement/{etudiant-id}/{departementt-id}
    @PostMapping ("/affecter-etudiant-departement/{etudiant-id}/{departementt-id}")
    public void assignEtudiantToDepartment(@PathVariable("etudiant-id")Integer idEtudiant ,
                                           @PathVariable("departementt-id")Integer idDepart)
    {
        etudiantService.assignEtudiantToDepartment(idEtudiant,idDepart);
    }
}
