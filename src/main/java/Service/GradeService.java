package Service;

import Domain.*;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class GradeService {
    private Map<Integer, Map<Integer, Grade>> gradesByExamId = new HashMap<>();

    public void saveGrade(Grade g) {
        gradesByExamId.computeIfAbsent(g.getExam().getId(), k -> new HashMap<>())
                .put(g.getStudent().getId(), g);
    }

    public Optional<Grade> findGrade(Exam exam, Student student) {
        return Optional.ofNullable(
                gradesByExamId.getOrDefault(exam.getId(), Map.of())
                        .get(student.getId())
        );
    }

    public double getExamGrade(Exam exam, Student student, Instant t) {
        return findGrade(exam, student).map(g -> g.valueAt(t)).orElse(Double.NaN);
    }

    public double getCourseGrade(Course course, Student student, Instant t) {
        var grades = gradesByExamId.values().stream()
                .flatMap(m -> m.values().stream())
                .filter(g -> g.getStudent().equals(student))
                .filter(g -> g.getExam().getCourse().equals(course))
                .collect(Collectors.toList());

        int totalCoef = grades.stream().mapToInt(g -> g.getExam().getCoefficient()).sum();
        double total = grades.stream().mapToDouble(g -> g.valueAt(t) * g.getExam().getCoefficient()).sum();
        return totalCoef == 0 ? Double.NaN : total / totalCoef;
    }
}
