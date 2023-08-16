package school.people;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private List<Course> coursesTaken;

    public Student(String name, int age, String gender) {
        super(name, age, gender);

        this.coursesTaken = new ArrayList<>();
    }

    public void takeCourse(Course course) {
        if(!coursesTaken.contains(course)) {
            coursesTaken.add(course);
        }
    }

    public void dropCourse(Course course) {
        if(coursesTaken.contains(course)) {
            coursesTaken.remove(course);
        }
    }

    public List<Course> getCoursesTaken() {
        if(coursesTaken.isEmpty()) {
            System.out.println("This student is not taking any courses");
        } else {
            System.out.println("This student is taking the following courses:");
            for(Course course : coursesTaken) {
                System.out.println(course.getName());
            }
        }

        return coursesTaken;
    }
}
