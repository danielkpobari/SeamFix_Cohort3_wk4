package school.people;

public abstract class Person {


    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void expelStudent(Student student, String Roles) {// utilizing the role class
        if (Roles == "Principal" && student.getAge() < 18) {
            System.out.println("You are too young to be expelled from this school.");
        } else {
            System.out.println("You have been expelled from this school.");
        }

    }


}
