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
    @Autowired
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
    // http://localhost:8089/kaddem/etudiant/getEtudiantsByDepartement/1
    @GetMapping ("/getEtudiantsByDepartement/{departementt-id}")
    public List<Etudiant> getEtudiantsByDepartement(@PathVariable("departementt-id")Integer idDepart)
    {

        return etudiantService.getEtudiantsByDepartement(idDepart);
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

    // http://localhost:8089/kaddem/etudiant/add-AndAssignEtudiantTo-Equipe-AndContract/1/1
    @PostMapping ("/add-AndAssignEtudiantTo-Equipe-AndContract/{Contract-id}/{Equipe-id}")
    public void addAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant e,@PathVariable("Contract-id")Integer idContract ,
                                           @PathVariable("Equipe-id")Integer idEquipe)
    {
        etudiantService.addAndAssignEtudiantToEquipeAndContract(e,idContract,idEquipe);
    }



    //***********************************************************************************//
    //my tests
    // http://localhost:8089/kaddem/etudiant/retrieve-EtudiantByname/{name}
    /*@GetMapping("/retrieve-EtudiantByname/{etudiant-prnm}")
    public List<Etudiant> retrieveEtudiantByname(@PathVariable("etudiant-prnm")String prenomE ) {
        List<Etudiant> listEtudiants = etudiantService.retrieveEtudiantByname(prenomE);
        return listEtudiants ;
    }

    // http://localhost:8089/kaddem/etudiant/retrieve-EtudiantByiddep/{id}
    @GetMapping("/retrieve-EtudiantByiddep/{etudiant-id}")
    public List<Etudiant> retrieveEtudiantBydepid(@PathVariable("etudiant-id")String idDepat ) {
        List<Etudiant> listEtudiants = etudiantService.retrieveEtudiantBydepid(idDepat);
        return listEtudiants ;
    }

*/

}
