package Domain;

import java.time.LocalDate;

public class Tutor {
    private int id;
    private String nom, prenom, email, telephone, descriptionLien;
    private LocalDate dateNaissance;

    public Tutor(int id, String nom, String prenom, LocalDate dateNaissance,
                 String email, String telephone, String descriptionLien) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephone = telephone;
        this.descriptionLien = descriptionLien;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public LocalDate getDateNaissance() { return dateNaissance; }
    public String getEmail() { return email; }
    public String getTelephone() { return telephone; }
    public String getDescriptionLien() { return descriptionLien; }
}
