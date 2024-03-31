// evaluation/services/EvaluationService.java
package evaluation.services;

import java.util.ArrayList;
import java.util.List;
import evaluation.models.Evaluation;

public class EvaluationService {
    private List<Evaluation> evaluations;

    public EvaluationService() {
        this.evaluations = new ArrayList<>();
    }

    // CREATE
    public void ajouterEvaluation(Evaluation evaluation) {
        evaluations.add(evaluation);
    }

    // READ
    public List<Evaluation> obtenirToutesEvaluations() {
        return evaluations;
    }

    // UPDATE
    public void modifierEvaluation(Evaluation evaluation) {

         for (int i = 0; i < evaluations.size(); i++) {
             if (evaluations.get(i).getId().equals(evaluation.getId())) {
                 evaluations.set(i, evaluation);
                 break;
             }
         }
    }

    // DELETE
    public void supprimerEvaluation(Evaluation evaluation) {
        evaluations.remove(evaluation);
    }
}
