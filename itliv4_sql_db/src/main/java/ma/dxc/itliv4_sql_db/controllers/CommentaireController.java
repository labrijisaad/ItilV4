package ma.dxc.itliv4_sql_db.controllers;

import ma.dxc.itliv4_sql_db.entities.Commentaire;
import ma.dxc.itliv4_sql_db.services.CommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CommentaireController {
    @Autowired
    private CommentaireService commentaireService;

    @PostMapping("/addCommentaire")
    public Commentaire saveCommentaire(@RequestBody Commentaire commentaire) {
        return commentaireService.saveCommentaire(commentaire);
    }

    @PostMapping("/addCommentaires")
    public List<Commentaire> saveUtilisateurs(@RequestBody List<Commentaire> commentaires) {
        return commentaireService.saveCommentaires(commentaires);
    }

    @GetMapping("/commentaires")
    public List<Commentaire> findAllCommentaires() {
        return commentaireService.getCommentaires();
    }

    @GetMapping("/commentaires/findByDescriptionContains/{content}")
    public List<Commentaire> findByDescriptionContains(@PathVariable String content){
        return commentaireService.findByDescriptionContains(content);
    }

    @GetMapping("/commentaires/findById/{id}")
    public Commentaire getCommentaireById(@PathVariable Long id) {
        return commentaireService.getCommentaireById(id);
    }


    @PutMapping("/updateCommentaire")
    public Commentaire UpdateCommentaire(@RequestBody Commentaire commentaire) {
        return commentaireService.updateCommentaire(commentaire);
    }

    @DeleteMapping("/deleteCommentaire/{id}")
    public String deleteCommentaire(@PathVariable Long id) {
        return commentaireService.deleteCommentaire(id);
    }
}
