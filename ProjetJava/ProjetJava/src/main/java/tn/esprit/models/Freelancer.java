package tn.esprit.models;

    public class Freelancer extends Utilisateur {
        private double tauxHoraire;
        private String domaineExperience;

        public Freelancer(String nomUtilisateur, String motDePasse, double tauxHoraire, String domaineExperience) {
            super(nomUtilisateur, motDePasse);
            this.tauxHoraire = tauxHoraire;
            this.domaineExperience = domaineExperience;
        }

        public double getTauxHoraire() {
            return tauxHoraire;
        }

        public void setTauxHoraire(double tauxHoraire) {
            this.tauxHoraire = tauxHoraire;
        }

        public String getDomaineExperience() {
            return domaineExperience;
        }

        public void setDomaineExperience(String domaineExperience) {
            this.domaineExperience = domaineExperience;
        }

        public void travailler() {
            // Code pour travailler
        }

        public void afficherDetails() {
            System.out.println("Nom d'utilisateur: " + nomUtilisateur);
            System.out.println("Mot de passe: " + motDePasse);
            System.out.println("Taux horaire: " + tauxHoraire);
            System.out.println("Domaine d'expérience: " + domaineExperience);
        }
    }



