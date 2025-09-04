package Domain;

import java.time.LocalDate;

public class Teacher {
    private int id;
    private String nom, prenom, email, telephone, specialite;
    private LocalDate dateNaissance;

    public Teacher(int id, String nom, String prenom, LocalDate dateNaissance,
                   String email, String telephone, String specialite) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephone = telephone;
        this.specialite = specialite;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public LocalDate getDateNaissance() { return dateNaissance; }
    public String getEmail() { return email; }
    public String getTelephone() { return telephone; }
    public String getSpecialite() { return specialite; }
}
