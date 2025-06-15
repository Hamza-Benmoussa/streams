package Exercice2;

public class Employer {
    private String nom;
    private String departement;
    private double salaire;

    public Employer(String nom, String departement, double salaire) {
        this.nom = nom;
        this.departement = departement;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return  "nom='" + nom + '\'' +
                ", departement='" + departement + '\'' +
                ", salaire=" + salaire;
    }
}
