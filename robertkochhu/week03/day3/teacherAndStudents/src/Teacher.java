public class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }

    public void answer(Student d) {
        System.out.println(this.name + " answers to " + d.name);
    }

    public void teach(Student c) {
        System.out.println(this.name + " teaches " + c.name);
        c.learn(this);
    }
}
