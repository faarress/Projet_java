package tn.esprit.models;

public class Client extends Utilisateur {
    private String domaine;

    public Client(String nomUtilisateur, String motDePasse, String domaine) {
        super(nomUtilisateur, motDePasse);
        this.domaine = domaine;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public void afficherDetails() {
        System.out.println("Nom d'utilisateur: " + nomUtilisateur);
        System.out.println("Mot de passe: " + motDePasse);
        System.out.println("Domaine: " + domaine);
    }
}