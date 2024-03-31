package evaluation.controllers;

import evaluation.models.Evaluation;
import evaluation.services.EvaluationService;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class EvaluationController {

    @FXML
    private TableView<Evaluation> table;
    @FXML
    private TableColumn<Evaluation, String> titreColumn;
    @FXML
    private TableColumn<Evaluation, String> descriptionColumn;
    @FXML
    private TableColumn<Evaluation, String> statutColumn;
    @FXML
    private TextField titreField;
    @FXML
    private TextField descriptionField;
    @FXML
    private TextField statutField;
    @FXML
    private Button deleteButton;
    @FXML
    private Button addButton;
    @FXML
    private Button updateButton;

    private EvaluationService evaluationService = new EvaluationService();

    @FXML
    public void initialize() throws IOException {
        loadEvaluations();
    }

    @FXML
    public void deleteEvaluation(ActionEvent event) throws IOException {
        Evaluation evaluation = table.getSelectionModel().getSelectedItem();
        if (evaluation != null) {
            evaluationService.supprimerEvaluation(evaluation);
            loadEvaluations();
        }
    }

    @FXML
    public void addEvaluation(ActionEvent event) throws IOException {
        String titre = titreField.getText();
        String description = descriptionField.getText();
        String statut = statutField.getText();
        if (!titre.isEmpty() && !description.isEmpty() && !statut.isEmpty()) {
            Evaluation evaluation = new Evaluation(titre, description, statut);
            evaluationService.ajouterEvaluation(evaluation);
            loadEvaluations();
            clearFields();
        }
    }

    @FXML
    public void updateEvaluation(ActionEvent event) throws IOException {
        Evaluation evaluation = table.getSelectionModel().getSelectedItem();
        if (evaluation != null) {
            String titre = titreField.getText();
            String description = descriptionField.getText();
            String statut = statutField.getText();
            if (!titre.isEmpty() && !description.isEmpty() && !statut.isEmpty()) {
                evaluation.setTitre(titre);
                evaluation.setDescription(description);
                evaluation.setStatut(statut);
                evaluationService.modifierEvaluation(evaluation);
                loadEvaluations();
                clearFields();
            }
        }
    }

    private void loadEvaluations() {
        ObservableList<Evaluation> evaluations = evaluationService.obtenirToutesEvaluations();
        table.setItems(evaluations);
    }

    private void clearFields() {
        titreField.clear();
        descriptionField.clear();
        statutField.clear();
    }
}
