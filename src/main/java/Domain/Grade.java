package Domain;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Grade {
    private Student student;
    private Exam exam;
    private List<GradeChange> historique = new ArrayList<>();

    public Grade(Student student, Exam exam, double valeurInitiale, Instant date) {
        this.student = student;
        this.exam = exam;
        historique.add(new GradeChange(valeurInitiale, "initial", date));
    }

    public void ajouterChangement(double valeur, String motif, Instant date) {
        historique.add(new GradeChange(valeur, motif, date));
    }

    public double valueAt(Instant t) {
        return historique.stream()
                .filter(c -> !c.getDate().isAfter(t))
                .reduce((a,b)->b)
                .map(GradeChange::getValeur)
                .orElse(Double.NaN);
    }

    public Student getStudent() {
        return student;
    }

    public Exam getExam() {
        return exam;
    }
}
