package school;

import school.people.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Applicant applicant = new Applicant("Daniel", 18,"Male");
        Principal principal = new Principal("Kpobari", 43, "male");
        Student student1 = new Student("dele", 12, "male");
        Student student2 = new Student("Esther", 13, "female");
        Course course2 = new Course("Mathematics", new Teacher("Akpenuchi", 28, "Male"), List.of(student1,student2 ));
        Course course1 = new Course("English", new Teacher("Hephzibah", 21,"Female"), List.of(student1,student2));

        System.out.println("the principal is " + principal.getName());
        System.out.println("the applicant is " + applicant.getName());

        System.out.println( principal.admitApplicant(applicant));
        Teacher teacher = new Teacher("Akpenuchi", 28,"Male");

        List<Course> coursesTaught = new ArrayList<>();
        coursesTaught.add(course1);
        coursesTaught.add(course2);
        teacher.setCoursesTaught(coursesTaught);
        System.out.println(teacher.getCoursesTaught().get(0).getName());
        System.out.println(teacher.getCoursesTaught().size());
        //System.out.println(teacher.teachCourse(course1));

        System.out.println(course1.getTeacher().getName());


    }
}
