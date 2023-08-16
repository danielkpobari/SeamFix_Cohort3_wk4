package school.people;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private Teacher teacher;
    private List<Student> studentsEnrolled;

    public Course(String name, Teacher teacher, List<Student> studentsEnrolled) {
        this.name = name;
        this.teacher = teacher;
        this.studentsEnrolled = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        if(!studentsEnrolled.contains(student)) {
            studentsEnrolled.add(student);
        }
    }

    public void removeStudent(Student student) {
        if(studentsEnrolled.contains(student)) {
            studentsEnrolled.remove(student);
        }
    }

    public List<Student> getStudentsEnrolled() {
        if(studentsEnrolled.isEmpty()) {
            System.out.println("There are no students enrolled in this course.");
        } else {
            System.out.println("The following students are enrolled in this course:");
            for(Student student : studentsEnrolled) {
                System.out.println(student.getName());
            }
        }

        return studentsEnrolled;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
