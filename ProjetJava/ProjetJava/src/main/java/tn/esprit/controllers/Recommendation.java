package recommendation.controllers;

import recommendation.models.Recommendation;
import recommendation.services.RecommendationService;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class RecommendationController {

    @FXML
    private TableView<Recommendation> table;
    @FXML
    private TableColumn<Recommendation, String> messageColumn;
    @FXML
    private TableColumn<Recommendation, String> utilisateurColumn;
    @FXML
    private TableColumn<Recommendation, String> dateColumn;
    @FXML
    private TableColumn<Recommendation, String> categorieColumn;
    @FXML
    private TableColumn<Recommendation, String> statutColumn;
    @FXML
    private TextField messageField;
    @FXML
    private TextField utilisateurField;
    @FXML
    private TextField dateField;
    @FXML
    private TextField categorieField;
    @FXML
    private TextField statutField;
    @FXML
    private Button deleteButton;
    @FXML
    private Button addButton;
    @FXML
    private Button updateButton;

    private RecommendationService recommendationService = new RecommendationService();

    @FXML
    public void initialize() throws IOException {
        loadRecommendations();
    }

    @FXML
    public void deleteRecommendation(ActionEvent event) throws IOException {
        Recommendation recommendation = table.getSelectionModel().getSelectedItem();
        if (recommendation != null) {
            recommendationService.supprimerRecommendation(recommendation);
            loadRecommendations();
        }
    }

    @FXML
    public void addRecommendation(ActionEvent event) throws IOException {
        String message = messageField.getText();
        String utilisateur = utilisateurField.getText();
        String date = dateField.getText();
        String categorie = categorieField.getText();
        String statut = statutField.getText();
        if (!message.isEmpty() && !utilisateur.isEmpty() && !date.isEmpty() && !categorie.isEmpty() && !statut.isEmpty()) {
            Recommendation recommendation = new Recommendation(message, utilisateur, date, categorie, statut);
            recommendationService.ajouterRecommendation(recommendation);
            loadRecommendations();
            clearFields();
        }
    }

    @FXML
    public void updateRecommendation(ActionEvent event) throws IOException {
        Recommendation recommendation = table.getSelectionModel().getSelectedItem();
        if (recommendation != null) {
            String message = messageField.getText();
            String utilisateur = utilisateurField.getText();
            String date = dateField.getText();
            String categorie = categorieField.getText();
            String statut = statutField.getText();
            if (!message.isEmpty() && !utilisateur.isEmpty() && !date.isEmpty() && !categorie.isEmpty() && !statut.isEmpty()) {
                recommendation.setMessage(message);
                recommendation.setUtilisateur(utilisateur);
                recommendation.setDate(date);
                recommendation.setCategorie(categorie);
                recommendation.setStatut(statut);
                recommendationService.modifierRecommendation(recommendation);
                loadRecommendations();
                clearFields();
            }
        }
    }

    private void loadRecommendations() {
        ObservableList<Recommendation> recommendations = recommendationService.obtenirToutesRecommandations();
        table.setItems(recommendations);
    }

    private void clearFields() {
        messageField.clear();
        utilisateurField.clear();
        dateField.clear();
        categorieField.clear();
        statutField.clear();
    }
}
