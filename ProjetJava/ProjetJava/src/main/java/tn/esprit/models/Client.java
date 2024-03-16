package tn.esprit.models;

import java.util.List;

public class Client extends Utilisateur {
    private int idClient;
    private String nomEntreprise;
    private String domaineActivite;
    private List<String> historiqueCollab;


    public Client(int idUser, String nom, String prenom, String adresseMail, String password, Date dateNaissance, Date dateCreationCompte, int idClient, String nomEntreprise, String domaineActivite, List<String> historiqueCollab) {
        super(idUser, nom, prenom, adresseMail, password, dateNaissance, dateCreationCompte);
        this.idClient = idClient;
        this.nomEntreprise = nomEntreprise;
        this.domaineActivite = domaineActivite;
        this.historiqueCollab = historiqueCollab;
    }


    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getDomaineActivite() {
        return domaineActivite;
    }

    public void setDomaineActivite(String domaineActivite) {
        this.domaineActivite = domaineActivite;
    }

    public List<String> getHistoriqueCollab() {
        return historiqueCollab;
    }

    public void setHistoriqueCollab(List<String> historiqueCollab) {
        this.historiqueCollab = historiqueCollab;
    }
}
