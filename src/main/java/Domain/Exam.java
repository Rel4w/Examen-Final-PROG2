package Domain;

import java.time.Instant;

public class Exam {
    private int id;
    private String titre;
    private Course course;
    private Instant dateHeure;
    private int coefficient;

    public Exam(int id, String titre, Course course, Instant dateHeure, int coefficient) {
        this.id = id;
        this.titre = titre;
        this.course = course;
        this.dateHeure = dateHeure;
        this.coefficient = coefficient;
    }

    public int getId() { return id; }
    public String getTitre() { return titre; }
    public Course getCourse() { return course; }
    public Instant getDateHeure() { return dateHeure; }
    public int getCoefficient() { return coefficient; }
}
