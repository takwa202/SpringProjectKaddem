package tn.esprit.spring.khaddem_takwa.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.khaddem_takwa.entities.Departement;
import tn.esprit.spring.khaddem_takwa.entities.DetailEquipe;
import tn.esprit.spring.khaddem_takwa.services.DepartementServices;
import tn.esprit.spring.khaddem_takwa.services.DetailsEquipeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/detail")
public class DetailController {
    @Autowired
    DetailsEquipeService detailsequipServices;
    // http://localhost:8089/kaddem/detail/retrieve-all-contrat
    @GetMapping("/retrieve-all-contrat")
    public List<DetailEquipe> getDetailsEquipet() {

        return  detailsequipServices.retrieveAllDetailsEquipe();
    }
    // http://localhost:8089/kaddem/detail/retrieve-DetailEquipe/{DetailEquipe-id}
    @GetMapping("/retrieve-DetailEquipe/{DetailEquipe-id}")
    public DetailEquipe retrieveDetailsEquipe(@PathVariable("DetailEquipe-id") Integer idequipe) {
        return detailsequipServices.retrieveDetailsEquipe(idequipe);}
    // http://localhost:8089/kaddem/detail/add-DetailEquipe
    @PostMapping("/add-DetailEquipe")
    public DetailEquipe addDetailsEquipe(@RequestBody DetailEquipe e) {
        DetailEquipe DetailEquipe = detailsequipServices.updateDetailsEquipe(e);
        return DetailEquipe;
    }
    // http://localhost:8089/kaddem/detail/remove-DetailEquipe/{DetailEquipe-id}
    @DeleteMapping("/remove-DetailEquipe/{DetailEquipe-id}")
    public void removeDetailsEquipe(@PathVariable("DetailEquipe-id") Long idequipe) {
        detailsequipServices.deleteDetailsEquipe(Math.toIntExact(idequipe));
    }
    // http://localhost:8089/kaddem/detail/update-DetailEquipe
    @PutMapping("/update-DetailEquipe")
    public DetailEquipe updateDetailsEquipe(@RequestBody DetailEquipe e) {
        DetailEquipe DetailEquipe= detailsequipServices.updateDetailsEquipe(e);
        return DetailEquipe;
    }

    
}
