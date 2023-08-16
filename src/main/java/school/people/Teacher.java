package school.people;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person implements Teacher_Interface{

    private List<Course> coursesTaught ;

    public Teacher(String name, int age, String gender) {
        super(name, age, gender);

        this.coursesTaught = new ArrayList<>();
    }



    public List<Course> getCoursesTaught() {
//        if(coursesTaught.isEmpty()) {
//            System.out.println("This teacher is not teaching any courses");
//        } else {
//            System.out.println("This teacher is teaching the following courses:");
//            for(Course course : coursesTaught) {
//                System.out.println(course.getName());
//            }
//        }

        return coursesTaught;
    }

    @Override //method overiding
    public boolean teachCourse(Course course) {
        if(!coursesTaught.contains(course)) {
            coursesTaught.add(course);

        }
        System.out.println("This teacher is teaching the following courses:" + course.getName());
        return false;
    }


    public void setCoursesTaught(List<Course> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }
}
