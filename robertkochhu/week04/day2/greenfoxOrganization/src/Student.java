public class Student extends Person {
    String previousOrganization;
    int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        int skippedDays = 0;
        this.previousOrganization = previousOrganization;
    }

    public Student() {
        super();
        previousOrganization = "life of school";
        skippedDays = 0;


    }


    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + this.name + "a " + this.age + " years old " + this.gender + " from " + this.previousOrganization + " who skipped " + this.skippedDays + " from the course already");
    }


    public int skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
        return skippedDays;


    }


}
