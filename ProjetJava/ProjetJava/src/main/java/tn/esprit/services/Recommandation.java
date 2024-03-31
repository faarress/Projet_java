// recommendation/services/RecommendationService.java
package recommendation.services;

import java.util.ArrayList;
import java.util.List;
import recommendation.models.Recommendation;

public class RecommendationService {
    private List<Recommendation> recommendations;

    public RecommendationService() {
        this.recommendations = new ArrayList<>();
    }

    // CREATE
    public void ajouterRecommendation(Recommendation recommendation) {
        recommendations.add(recommendation);
    }

    // READ
    public List<Recommendation> obtenirToutesRecommandations() {
        return recommendations;
    }

    // UPDATE
    public void modifierRecommendation(Recommendation recommendation) {

         for (int i = 0; i < recommendations.size(); i++) {
             if (recommendations.get(i).getId().equals(recommendation.getId())) {
                 recommendations.set(i, recommendation);
                 break;
             }
         }
    }

    // DELETE
    public void supprimerRecommendation(Recommendation recommendation) {
        recommendations.remove(recommendation);
    }
}
