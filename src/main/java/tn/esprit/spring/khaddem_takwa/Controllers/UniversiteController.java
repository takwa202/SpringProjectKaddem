package tn.esprit.spring.khaddem_takwa.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.khaddem_takwa.entities.Universite;
import tn.esprit.spring.khaddem_takwa.services.IContratServices;
import tn.esprit.spring.khaddem_takwa.services.IUniversiteServices;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/university")
public class UniversiteController {
    @Autowired
    IUniversiteServices UniversiteServices;

    // http://localhost:8089/Khadema/university/retrieve-all-university
    @GetMapping("/retrieve-all-university")
    public List<Universite> getUniversities() {
        List<Universite> listUniversities = UniversiteServices.retrieveAllUniversites();
        return listUniversities;
    }

    // http://localhost:8089/Khadem/university/retrieve-university/8
    @GetMapping("/retrieve-university/{university-id}")
    public Universite retrieveUniversity(@PathVariable("university-id") Integer idUniv) {
        return UniversiteServices.retrieveUniversite(idUniv);
    }

    // http://localhost:8089/Khadem/university/add-university
    @PostMapping("/add-university")
    public Universite addUniversity(@RequestBody Universite u) {
        Universite university = UniversiteServices.addUniversite(u);
        return university;
    }

    // http://localhost:8089/Khadem/university/remove-university/1
    @DeleteMapping("/remove-university/{university-id}")
    public void removeOperateur(@PathVariable("university-id") Integer idUniv) {
        UniversiteServices.deleteUniversite(idUniv);
    }


    // http://localhost:8089/Khadem/university/update-university
    @PutMapping("/update-university")
    public Universite updateUniversity(@RequestBody Universite u) {
        Universite Universite= UniversiteServices.updateUniversite(u);
        return Universite;
    }

    // http://localhost:8089/kaddem/university/affecter-university-departement/{university-id}/{university-id}
    @PostMapping ("/affecter-university-departement/{university-id}/{university-id}")
    public void assignEtudiantToDepartment(@PathVariable("university-id")Integer idUniv ,
                                           @PathVariable("university-id")Integer idDepart)
    {
        UniversiteServices.assignUniversiteToDepartement(idUniv,idDepart);
    }
}
