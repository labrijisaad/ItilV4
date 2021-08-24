package ma.dxc.itliv4_sql_db.services;

import ma.dxc.itliv4_sql_db.entities.Commentaire;
import ma.dxc.itliv4_sql_db.repositories.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class CommentaireService {
    @Autowired
    private CommentaireRepository commentaireRepository;

    public Commentaire saveCommentaire(Commentaire commentaire) {
        return commentaireRepository.save(commentaire);
    }

    public List<Commentaire> saveCommentaires(List<Commentaire> commentaires) {
        return commentaireRepository.saveAll(commentaires);
    }

    public List<Commentaire> getCommentaires() {
        return commentaireRepository.findAll();
    }

    public List<Commentaire> findByDescriptionContains(String content){
        return commentaireRepository.findByDescriptionContains(content);
    }

    public Commentaire getCommentaireById(Long id) {
        return commentaireRepository.findById(id).orElse(null);
    }

    public String deleteCommentaire(Long id) {
        commentaireRepository.deleteById(id);
        return "Commentaire " + id + " was deleted";
    }

    public Commentaire updateCommentaire(Commentaire commentaire) {
        Commentaire existingCommentaire = commentaireRepository.findById(commentaire.getId()).orElse(null);
        Objects.requireNonNull(existingCommentaire).setDescription(commentaire.getDescription());
        return commentaireRepository.save(existingCommentaire);
    }
}
