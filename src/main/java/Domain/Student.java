package Domain;

import java.time.LocalDate;

public class Student {
    private int id;
    private String nom, prenom, email, telephone, groupe;
    private LocalDate dateNaissance;
    private Tutor tuteur;

    public Student(int id, String nom, String prenom, LocalDate dateNaissance,
                   String email, String telephone, String groupe, Tutor tuteur) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephone = telephone;
        this.groupe = groupe;
        this.tuteur = tuteur;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public LocalDate getDateNaissance() { return dateNaissance; }
    public String getEmail() { return email; }
    public String getTelephone() { return telephone; }
    public String getGroupe() { return groupe; }
    public Tutor getTuteur() { return tuteur; }
}
