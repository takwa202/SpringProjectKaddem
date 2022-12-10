package tn.esprit.spring.khaddem_takwa.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.khaddem_takwa.entities.Equipe;
import tn.esprit.spring.khaddem_takwa.services.EquipeServices;
import tn.esprit.spring.khaddem_takwa.services.IEquipeServices;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipe")
public class EquipeController {
    @Autowired
    IEquipeServices equipeService;
    // http://localhost:8089/kaddem/equipe/retrieve-all-equipes
    @GetMapping("/retrieve-all-equipes")
    public List<Equipe> getEquipes() {
        List<Equipe> listEquipes = equipeService.retrieveAllEquipes();
        return listEquipes;
    }

    // http://localhost:8089/kaddem/equipe/retrieve-equipe/{equipe-id}
    @GetMapping("/retrieve-equipe/{equipe-id}")
    public Equipe retrieveEquipe(@PathVariable("equipe-id") Integer equipeId) {
        return equipeService.retrieveEquipe(equipeId);}
    // http://localhost:8089/kaddem/equipe/add-equipe
    @PostMapping("/add-equipe")
    public Equipe addEquipe(@RequestBody Equipe e) {
        Equipe equipe = equipeService.addEquipe(e);
        return equipe;
    }
    // http://localhost:8089/kaddem/equipe/remove-equipe/{equipe-id}
    @DeleteMapping("/remove-equipe/{equipe-id}")
    public void removeOperateur(@PathVariable("equipe-id") Integer equipeId) {
        equipeService.deleteEquipe(equipeId);
}
    // http://localhost:8089/kaddem/equipe/update-equipe
    @PutMapping("/update-equipe")
    public Equipe updateEtudiant(@RequestBody Equipe e) {
        Equipe equipe= equipeService.updateEquipe(e);
        return equipe;
    }


}