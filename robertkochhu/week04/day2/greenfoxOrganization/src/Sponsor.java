public class Sponsor extends Person {
    String company;
    int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;

    }

    public Sponsor() {
        super();
        this.company = "Google";
        this.hiredStudents = 0;

    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + this.name + "a " + this.age + "years old " + this.gender + "who represents " + this.company + " and hired " + this.hiredStudents + " so far.");

    }

    public int hire(int hiredNumbers) {
        this.hiredStudents += hiredNumbers;
        return hiredStudents;
    }
}
