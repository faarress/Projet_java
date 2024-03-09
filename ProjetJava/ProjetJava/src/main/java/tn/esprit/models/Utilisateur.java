package tn.esprit.models;

public class Utilisateur {
        private int id, age;
        private String nom, prenom;
    protected String nomUtilisateur, motDePasse;
        public Utilisateur(int id, int age, String nom, String prenom, String nomUtilisateur, String motDePasse) {
            this.id = id;
            this.age = age;
            this.nom = nom;
            this.prenom = prenom;
            this.nomUtilisateur = nomUtilisateur;
            this.motDePasse = motDePasse;
        }

        public Utilisateur(int age, String nom, String prenom) {
            this.age = age;
            this.nom = nom;
            this.prenom = prenom;
        }

        public Utilisateur(String nomUtilisateur, String motDePasse) {

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        @Override
        public String toString() {
            return "Personne{" +
                    "id=" + id +
                    ", age=" + age +
                    ", nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    '}';
        }






    }


