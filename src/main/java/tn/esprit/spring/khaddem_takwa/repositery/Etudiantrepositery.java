package tn.esprit.spring.khaddem_takwa.repositery;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.khaddem_takwa.entities.Departement;
import tn.esprit.spring.khaddem_takwa.entities.Etudiant;
import tn.esprit.spring.khaddem_takwa.entities.Niveau;

import java.util.List;
@Repository

public interface Etudiantrepositery extends JpaRepository<Etudiant,Integer>
{
  List<Etudiant> findByDepartementIdDepart(Integer idDepart);
   List<Etudiant>findByEquipeNiveauLike(Niveau SENIOR);


  //select simple with  1 condition
  @Query("SELECT e FROM Etudiant e WHERE e.prenomE =:prenomE")
  List<Etudiant> retrieveEtudiantByname(@Param("prenomE") String prenomE);

  @Query(value = "SELECT * FROM Etudiant e WHERE e.prenome = :prenome",
          nativeQuery = true)
  List<Etudiant> retrieveEtudiantBynamesql(@Param("prenome") String prenome);




//select woth  join

 @Query("SELECT e FROM Etudiant e , Departement d where e.departement.idDepart = d.idDepart and d.nomDepat =:nomDepat")
          List<Etudiant> retrieveEtudiantBydepid(@Param("nomDepat") String nomDepat);
  @Query("SELECT e FROM Etudiant e , Departement d where  e.departement.idDepart = d.idDepart  and e.departement.idDepart =: idDepart")
  List<Etudiant> retrieveEtudiantBydepiddepart(@Param("idDepart") Integer idDepart);

}
