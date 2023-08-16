package school.people;

public class Principal extends Person {


    public Principal(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void expelStudent(Student student) {
        if(student.getAge() < 18){
            System.out.println("You are too young to be expelled from this school.");
        } else {
            System.out.println("You have been expelled from this school.");
        }
    }

    public String admitApplicant(Applicant applicant) {
        if(applicant.getAge() > 18){
            return "You are too old to be admitted to this school.";
        }
        return "You have been admitted to this school.";
    }
}
