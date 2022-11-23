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
    @GetMapping("/retrieve-all-equipes")
    public List<Equipe> getEquipes() {
        List<Equipe> listEquipes = equipeService.retrieveAllEquipes();
        return listEquipes;
    }
    @GetMapping("/retrieve-equipe/{equipe-id}")
    public Equipe retrieveEquipe(@PathVariable("equipe-id") Integer equipeId) {
        return equipeService.retrieveEquipe(Long.valueOf(equipeId));}

    @PostMapping("/add-equipe")
    public Equipe addEquipe(@RequestBody Equipe e) {
        Equipe equipe = equipeService.addEquipe(e);
        return equipe;
    }
    @DeleteMapping("/remove-equipe/{equipe-id}")
    public void removeOperateur(@PathVariable("equipe-id") Long equipeId) {
        equipeService.deleteEquipe(equipeId);
}
    @PutMapping("/update-equipe")
    public Equipe updateEtudiant(@RequestBody Equipe e) {
        Equipe equipe= equipeService.updateEquipe(e);
        return equipe;
    }


}