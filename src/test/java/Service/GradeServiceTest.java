package Service;

import Domain.*;
import org.junit.jupiter.api.Test;
import java.time.*;
import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest {

    @Test
    void testExamGrade() {
        Tutor t = new Tutor(1,"Andria","Jonathan",LocalDate.of(1980,1,1),"a@x","123","Père");
        Student s = new Student(1,"Randria","Jean",LocalDate.of(2000,1,1),"jd@x","321","G1",t);
        Teacher teacher = new Teacher(1,"Prof","John",LocalDate.of(1970,1,1),"a@x","111","Java");
        Course c = new Course(1,"PROG2",5,teacher);
        Exam e = new Exam(1,"Exam1",c,Instant.now(),2);
        Grade g = new Grade(s,e,12,Instant.now());
        g.ajouterChangement(15,"correction",Instant.now());

        GradeService service = new GradeService();
        service.saveGrade(g);

        double val = service.getExamGrade(e,s,Instant.now());
        assertEquals(15,val);
    }

    @Test
    void testCourseGrade() {
        Teacher teacher = new Teacher(1,"Prof","John",LocalDate.of(1970,1,1),"a@x","111","Java");
        Course c = new Course(1,"PROG2",5,teacher);
        Student s = new Student(1,"Randria","Jean",LocalDate.of(2000,1,1),"jd@x","321","G1", null);

        Exam e1 = new Exam(1,"Exam1",c,Instant.now(),2);
        Exam e2 = new Exam(2,"Exam2",c,Instant.now(),3);

        Grade g1 = new Grade(s,e1,10,Instant.now());
        Grade g2 = new Grade(s,e2,15,Instant.now());

        GradeService service = new GradeService();
        service.saveGrade(g1);
        service.saveGrade(g2);

        double avg = service.getCourseGrade(c,s,Instant.now());
        assertEquals(13, avg);
    }
}
