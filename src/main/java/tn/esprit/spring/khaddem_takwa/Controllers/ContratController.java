package tn.esprit.spring.khaddem_takwa.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.khaddem_takwa.entities.Contrat;
import tn.esprit.spring.khaddem_takwa.services.ContratServices;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratController {
    // http://localhost:8089/Khademtakwa/contrat/retrieve-all-contrats
    @Autowired
    ContratServices contratServices;
    @GetMapping("/retrieve-all-contrat")
    public List<Contrat> getEquipes() {

        return  contratServices.retrieveAllContrats();
    }
    // http://localhost:8089/Khademtakwa/contrat/retrieve-contrat/?
    @GetMapping("/retrieve-contrat/{contrat-id}")
    public Contrat retrieveContrat(@PathVariable("contrat-id") Integer idContrat) {
        return contratServices.retrieveContrat(idContrat);}
    // http://localhost:8089/Khademtakwa/contrat/add-equipe
    @PostMapping("/add-equipe")
    public Contrat addContrat(@RequestBody Contrat e) {
        Contrat Contrat = contratServices.addContrat(e);
        return Contrat;
    }
    // http://localhost:8089/Khademtakwa/contrat/remove-equipe/?
    @DeleteMapping("/remove-equipe/{equipe-id}")
    public void removecontrat(@PathVariable("equipe-id") Long idContrat) {
        contratServices.removeContrat(Math.toIntExact(idContrat));
    }
    // http://localhost:8089/Khademtakwa/contrat/update-equipe
    @PutMapping("/update-equipe")
    public Contrat updateEtudiant(@RequestBody Contrat e) {
        Contrat Contrat= contratServices.updateContrat(e);
        return Contrat;
    }


}
